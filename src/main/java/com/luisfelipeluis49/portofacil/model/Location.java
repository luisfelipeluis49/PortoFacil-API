package com.luisfelipeluis49.portofacil.model;

import jakarta.persistence.*;
import lombok.Data;

@Data @Entity @Table(name = "T_PF_LOCATION")
public class Location {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_LOCATION")
    private long id;
    @Column(name = "ZIPCODE")
    private String zipcode;
    @Column(name = "CITY")
    private String city;
    @Column(name = "THOROUGHFARE")
    private String thoroughfare;
    @Column(name = "KM")
    private int km;
    @Column(name = "NUM")
    private int num;
    @Column(name = "REFERENCE")
    private String reference;
}
