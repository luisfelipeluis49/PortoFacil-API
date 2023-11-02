package com.luisfelipeluis49.portofacil.model;

import jakarta.persistence.*;
import lombok.Data;

@Data @Entity @Table(name = "T_PF_TOW_TRUCK")
public class TowTruck {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TOW_TRUCK")
    private long id;
    @Column(name = "TOW_TRUCK_NAME")
    private String name;
    @Column(name = "GAS")
    private float gas;
    @Column(name = "TOOLS")
    private String tools;
    @Column(name = "LICENSE_PLATE")
    private String licensePlate;
    @OneToOne
    @JoinColumn(name = "ID_DRIVER", referencedColumnName = "ID_DRIVER")
    private Driver driver;
    @OneToOne
    @JoinColumn(name = "ID_TYPE_OF_TOW_TRUCK", referencedColumnName = "ID_TYPE_OF_TOW_TRUCK")
    private TypeOfTowTruck typeOfTowTruck;
}
