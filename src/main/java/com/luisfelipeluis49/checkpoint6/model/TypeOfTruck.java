package com.luisfelipeluis49.checkpoint6.model;

import lombok.Data;

@Data
public class TypeOfTruck {
    private long id;
    private boolean tractor;
    private float weight;
    private String model;
    private int year;
    private float fuelCapacity;
    private Category category;
    private Brand brand;
}
