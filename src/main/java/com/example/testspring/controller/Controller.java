package com.example.testspring.controller;

import com.example.testspring.model.Model;
import com.example.testspring.model.Response;
import com.example.testspring.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sso")
public class Controller {

  @Autowired
  private Service service;

  @PostMapping("post")
  public ResponseEntity<Response> post(@RequestBody Model entity) {
    return service.post(entity);
  }
}
