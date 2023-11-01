package com.luisfelipeluis49.checkpoint6.model;

import lombok.Data;

import java.sql.Date;

@Data
public class Client {
    private long id;
    private String name;
    private Date birthdate;
    private char genre;
    private String driverLicense;
    private char driverLicenseType;
}
