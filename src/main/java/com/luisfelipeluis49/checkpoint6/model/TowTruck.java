package com.luisfelipeluis49.checkpoint6.model;

import lombok.Data;

@Data
public class TowTruck {
    private long id;
    private String name;
    private float gas;
    private String licensePlate;
    private String tools;
    private Driver driver;
    private TypeOfTowTruck typeOfTowTruck;
}
