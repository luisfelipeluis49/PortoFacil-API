package com.luisfelipeluis49.portofacil.model;

import jakarta.persistence.*;
import lombok.Data;

@Data @Entity @Table(name = "T_PF_TYPE_OF_TRUCK")
public class TypeOfTruck {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TYPE_OF_TRUCK")
    private long id;
    @Column(name = "TRACTOR")
    private boolean tractor;
    @Column(name = "TYPE_OF_TRUCK_WEIGHT")
    private float weight;
    @Column(name = "MODEL")
    private String model;
    @Column(name = "TYPE_OF_TRUCK_YEAR")
    private int year;
    @Column(name = "FUEL_CAPACITY")
    private float fuelCapacity;
    @OneToOne
    @JoinColumn(name = "ID_CATEGORY", referencedColumnName = "ID_CATEGORY")
    private Category category;
    @OneToOne
    @JoinColumn(name = "ID_BRAND", referencedColumnName = "ID_BRAND")
    private Brand brand;
}
