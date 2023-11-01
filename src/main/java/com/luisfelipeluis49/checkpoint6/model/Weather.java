package com.luisfelipeluis49.checkpoint6.model;

import lombok.Data;

@Data
public class Weather {
    private long weather;
    private float wind;
    private float precipitation;
    private float temperature;
    private boolean snowing;
    private boolean raining;
}
