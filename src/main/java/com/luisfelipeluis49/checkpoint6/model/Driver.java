package com.luisfelipeluis49.checkpoint6.model;

import lombok.Data;

import java.sql.Date;

@Data
public class Driver {
    private long id;
    private boolean status;
    private String name;
    private Date birthdate;
    private char genre;
    private String license;
    private char licenseType;
}
