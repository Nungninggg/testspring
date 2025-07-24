# Project

API SSO TEST

## Description

Write a Service that receives the Insert data and responds as required. Use Swagger to test the data API. If successful, it returns the userId and tokenId. If the Insert fails, it returns responseCode E000001 to indicate failure

## table sso_user_test
```
(
    request_date          timestamp not null
        constraint pk_sso_user_test
            primary key,
    ssotype               varchar(50),
    systemid              varchar(50),
    systemname            varchar(250),
    systemtransactions    varchar(250),
    systemprivileges      varchar(250),
    systemusergroup       varchar(50),
    systemlocationgroup   varchar(50),
    userid                varchar(200),
    userfullname          varchar(500),
    userrdofficecode      varchar(250),
    userofficecode        varchar(250),
    clientlocation        varchar(250),
    locationmachinenumber varchar(500),
    tokenid               varchar(1000)
);
```
## POST API try it out
```
{
  "requestDate": "2025-07-23T04:41:44.823Z",
  "ssoType": "string",
  "systemId": "string",
  "systemName": "string",
  "systemTransactions": "string",
  "systemPrivileges": "string",
  "systemUserGroup": "string",
  "systemLocationGroup": "string",
  "userId": "string",
  "userFullName": "string",
  "userRdOfficeCode": "string",
  "userOfficeCode": "string",
  "clientLocation": "string",
  "locationMachineNumber": "string",
  "tokenId": "string"
}
```
## EXECUTE
### Response
```
{
  "responseCode": "I07000",
  "responseMessage": "ทำรายการเรียบร้อย",
  "responseData": {
    "userId": "string",
    "tokenId": "string"
  }
}
```

### instll
Spring boot version 3.3.9

JAVA 21

Postgre 15

springdoc 2.5.0

Apache Maven

### Swagger Link : http://localhost:8080/apitest/swagger-ui.html

