package com.luisfelipeluis49.portofacil.model;

import jakarta.persistence.*;
import lombok.Data;

@Data @Entity @Table(name = "T_PF_CATEGORY")
public class Category {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CATEGORY")
    private long id;
    @Column(name = "MIN_WEIGHT")
    private float minWeight;
    @Column(name = "MAX_WEIGHT")
    private float maxWeight;
    @Column(name = "CATEGORY_STATUS")
    private boolean status;
}
