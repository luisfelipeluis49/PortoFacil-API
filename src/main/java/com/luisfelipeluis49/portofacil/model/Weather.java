package com.luisfelipeluis49.portofacil.model;

import jakarta.persistence.*;
import lombok.Data;

@Data @Entity @Table(name = "T_PF_WEATHER")
public class Weather {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_WEATHER")
    private long id;
    @Column(name = "WIND")
    private float wind;
    @Column(name = "PRECIPITATION")
    private float precipitation;
    @Column(name = "TEMPERATURE")
    private float temperature;
    @Column(name = "SNOW")
    private boolean snowing;
    @Column(name = "RAIN")
    private boolean raining;
}
