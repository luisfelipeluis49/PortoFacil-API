package com.luisfelipeluis49.portofacil.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data @Entity @Table(name = "T_PF_DRIVER")
public class Driver {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DRIVER")
    private long id;
    @Column(name = "DRIVER_STATUS")
    private boolean status;
    @Column(name = "DRIVER_NAME")
    private String name;
    @Column(name = "BIRTHDATE")
    private Date birthdate;
    @Column(name = "GENRE")
    private char genre;
    @Column(name = "LICENSE")
    private String license;
    @Column(name = "LICENSE_TYPE")
    private char licenseType;
}
