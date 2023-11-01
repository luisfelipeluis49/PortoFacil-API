package com.luisfelipeluis49.checkpoint6.model;

import lombok.Data;

@Data
public class TypeOfTowTruck {
    private long id;
    private boolean platform;
    private float weight;
    private String model;
    private int year;
    private Brand brand;
}
