package com.luisfelipeluis49.portofacil.model;

import jakarta.persistence.*;
import lombok.Data;

@Data @Entity @Table(name = "T_PF_INSURANCE")
public class Insurance {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_INSURANCE")
    private long id;
    @Column(name = "PRICE")
    private float price;
    @OneToOne
    @JoinColumn(name = "ID_CATEGORY", referencedColumnName = "ID_CATEGORY")
    private Category category;
}
