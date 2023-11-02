package com.luisfelipeluis49.portofacil.model;

import jakarta.persistence.*;
import lombok.Data;

@Data @Entity @Table(name = "T_PF_BRAND")
public class Brand {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_BRAND")
    private long id;
    @Column(name = "BRAND_NAME")
    private String name;
    @Column(name = "NATIONAL_BRAND")
    private boolean national;
}
