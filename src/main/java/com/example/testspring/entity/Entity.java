package com.example.testspring.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@jakarta.persistence.Entity
@Table(name = "sso_user_test")
public class Entity {

    @Id
    @Column(name = "request_date", nullable = false)
    private Date requestDate;

    @Column(name = "ssoType", length = 50)
    private String ssoType;

    @Column(name = "systemId", length = 50)
    private String systemId;

    @Column(name = "systemName", length = 250)
    private String systemName;

    @Column(name = "systemTransactions", length = 250)
    private String systemTransactions;

    @Column(name = "systemPrivileges", length = 250)
    private String systemPrivileges;

    @Column(name = "systemUserGroup", length = 50)
    private String systemUserGroup;

    @Column(name = "systemLocationGroup", length = 50)
    private String systemLocationGroup;

    @Column(name = "userId", length = 200)
    private String userId;

    @Column(name = "userFullName", length = 500)
    private String userFullname;

    @Column(name = "userRdOfficeCode", length = 250)
    private String userRdOfficeCode;

    @Column(name = "userOfficeCode", length = 250)
    private String userOfficeCode;

    @Column(name = "clientLocation", length = 250)
    private String clientLocation;

    @Column(name = "locationMachineNumber", length = 500)
    private String locationMachineNumber;

    @Column(name = "tokenId", length = 1000)
    private String tokenId;



    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getSsoType() {
        return ssoType;
    }

    public void setSsoType(String ssoType) {
        this.ssoType = ssoType;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getSystemTransactions() {
        return systemTransactions;
    }

    public void setSystemTransactions(String systemTransactions) {
        this.systemTransactions = systemTransactions;
    }

    public String getSystemPrivileges() {
        return systemPrivileges;
    }

    public void setSystemPrivileges(String systemPrivileges) {
        this.systemPrivileges = systemPrivileges;
    }

    public String getSystemUserGroup() {
        return systemUserGroup;
    }

    public void setSystemUserGroup(String systemUserGroup) {
        this.systemUserGroup = systemUserGroup;
    }

    public String getSystemLocationGroup() {
        return systemLocationGroup;
    }

    public void setSystemLocationGroup(String systemLocationGroup) {
        this.systemLocationGroup = systemLocationGroup;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserFullname() {
        return userFullname;
    }

    public void setUserFullname(String userFullname) {
        this.userFullname = userFullname;
    }

    public String getUserRdOfficeCode() {
        return userRdOfficeCode;
    }

    public void setUserRdOfficeCode(String userRdOfficeCode) {
        this.userRdOfficeCode = userRdOfficeCode;
    }

    public String getUserOfficeCode() {
        return userOfficeCode;
    }

    public void setUserOfficeCode(String userOfficeCode) {
        this.userOfficeCode = userOfficeCode;
    }

    public String getClientLocation() {
        return clientLocation;
    }

    public void setClientLocation(String clientLocation) {
        this.clientLocation = clientLocation;
    }

    public String getLocationMachineNumber() {
        return locationMachineNumber;
    }

    public void setLocationMachineNumber(String locationMachineNumber) {
        this.locationMachineNumber = locationMachineNumber;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }
}
