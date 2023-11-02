package com.luisfelipeluis49.portofacil.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data @Entity @Table(name = "T_PF_CLIENT")
public class Client {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENT")
    private long id;
    @Column(name = "CLIENT_NAME")
    private String name;
    @Column(name = "BIRTHDATE")
    private Date birthdate;
    @Column(name = "GENRE")
    private char genre;
    @Column(name = "DRIVER_LICENSE")
    private String driverLicense;
    @Column(name = "DRIVER_LICENSE_TYPE")
    private char driverLicenseType;
}
