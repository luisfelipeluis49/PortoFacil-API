package com.luisfelipeluis49.portofacil.model;

import jakarta.persistence.*;
import lombok.Data;

@Data @Entity @Table(name = "T_PF_TRUCK")
public class Truck {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TRUCK")
    private long id;
    @Column(name = "TRUCK_NAME")
    private String name;
    @Column(name = "FUEL")
    private float fuel;
    @Column(name = "ELECTRIC")
    private boolean electric;
    @OneToOne
    @JoinColumn(name = "ID_CLIENT", referencedColumnName = "ID_CLIENT")
    private Client client;
    @OneToOne
    @JoinColumn(name = "ID_TYPE_OF_TRUCK", referencedColumnName = "ID_TYPE_OF_TRUCK")
    private TypeOfTruck typeOfTruck;
}
