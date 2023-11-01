package com.luisfelipeluis49.checkpoint6.model;

import lombok.Data;

@Data
public class Truck {
    private long id;
    private String name;
    private float fuel;
    private boolean electric;
    private Client client;
    private TypeOfTruck typeOfTruck;
}
