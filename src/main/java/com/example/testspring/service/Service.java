package com.example.testspring.service;

import com.example.testspring.entity.Entity;
import com.example.testspring.model.Model;
import com.example.testspring.model.Response;
import com.example.testspring.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.server.ResponseStatusException;
//import org.springframework.stereotype.Service;


import java.util.Date;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private Repository repository;


    public ResponseEntity<Response> post(Model model) {
        try {
            if (model == null || model.getUserId() == null || model.getUserId().isEmpty()) {
                Response error = new Response("E40000", "ข้อมูลไม่ครบถ้วน", null);
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
            }

            if (model.getRequestDate() == null) {
                model.setRequestDate(new Date());
            }

            Entity entity = new Entity();
            entity.setRequestDate(model.getRequestDate());
            entity.setSsoType(model.getSsoType());
            entity.setSystemId(model.getSystemId());
            entity.setSystemName(model.getSystemName());
            entity.setSystemTransactions(model.getSystemTransactions());
            entity.setSystemPrivileges(model.getSystemPrivileges());
            entity.setSystemUserGroup(model.getSystemUserGroup());
            entity.setSystemLocationGroup(model.getSystemLocationGroup());
            entity.setUserId(model.getUserId());
            entity.setUserFullname(model.getUserFullName());
            entity.setUserRdOfficeCode(model.getUserRdOfficeCode());
            entity.setUserOfficeCode(model.getUserOfficeCode());
            entity.setClientLocation(model.getClientLocation());
            entity.setLocationMachineNumber(model.getLocationMachineNumber());
            entity.setTokenId(model.getTokenId());

            Entity saved = repository.save(entity);

            Response.ResponseData data = new Response.ResponseData(
                    saved.getUserId(),
                    saved.getTokenId()
            );

            if (data.getUserId() == null || data.getTokenId() == null) {
                Response error = new Response("E000001", "ข้อมูลไม่ครบถ้วน", null);
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
            }

            Response success = new Response("I07000", "ทำรายการเรียบร้อย", data);
            return ResponseEntity.ok(success);

        } catch (Exception e) {
            Response error = new Response("E50000", "ไม่สามารถบันทึกข้อมูลลงฐานข้อมูลได้", null);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
        }
    }
}
