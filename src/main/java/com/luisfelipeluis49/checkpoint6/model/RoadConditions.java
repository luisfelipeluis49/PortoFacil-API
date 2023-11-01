package com.luisfelipeluis49.checkpoint6.model;

import lombok.Data;

@Data
public class RoadConditions {
    private long id;
    private boolean holes, bump, wet, oiled, obstacles, intenseTraffic;
}
