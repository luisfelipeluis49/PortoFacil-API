package com.luisfelipeluis49.checkpoint6.model;

import lombok.Data;

@Data
public class Ticket {
    private long id;
    private boolean open;
    private RoadConditions roadConditions;
    private TruckConditions truckConditions;
    private Location location;
    private TowTruck towTruck;
    private Weather weather;
    private Problem problem;
    private Truck truck;
}
