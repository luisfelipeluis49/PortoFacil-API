package com.luisfelipeluis49.portofacil.model;

import jakarta.persistence.*;
import lombok.Data;

@Data @Entity @Table(name = "T_PF_ROAD_CONDITIONS")
public class RoadConditions {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ROAD_CONDITIONS")
    private long id;
    @Column(name = "HOLES")
    private boolean holes;
    @Column(name = "BUMP")
    private boolean bump;
    @Column(name = "WET")
    private boolean wet;
    @Column(name = "OILED")
    private boolean oiled;
    @Column(name = "OBSTACLES")
    private boolean obstacles;
    @Column(name = "INTENSE_TRAFFIC")
    private boolean intenseTraffic;
}
