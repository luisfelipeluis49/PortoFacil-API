package com.luisfelipeluis49.portofacil.model;

import jakarta.persistence.*;
import lombok.Data;

@Data @Entity @Table(name = "T_PF_TYPE_OF_TOW_TRUCK")
public class TypeOfTowTruck {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TYPE_OF_TOW_TRUCK")
    private long id;
    @Column(name = "PLATFORM")
    private boolean platform;
    @Column(name = "TYPE_OF_TOW_TRUCK_WEIGHT")
    private float weight;
    @Column(name = "MODEL")
    private String model;
    @Column(name = "TYPE_OF_TOW_TRUCK_YEAR")
    private int year;
    @OneToOne
    @JoinColumn(name = "ID_BRAND", referencedColumnName = "ID_BRAND")
    private Brand brand;
}
