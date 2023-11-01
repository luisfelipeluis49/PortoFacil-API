package com.luisfelipeluis49.checkpoint6.model;

import lombok.Data;

@Data
public class Category {
    private long id;
    private float minWeight, maxWeight;
    private boolean status;
}
