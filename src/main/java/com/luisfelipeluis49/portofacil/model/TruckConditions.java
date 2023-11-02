package com.luisfelipeluis49.portofacil.model;

import jakarta.persistence.*;
import lombok.Data;

@Data @Entity @Table(name = "T_PF_TRUCK_CONDITIONS")
public class TruckConditions {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TRUCK_CONDITIONS")
    private long id;
    @Column(name = "CRASHED")
    private boolean crashed;
    @Column(name = "BLOWN_TYRE")
    private boolean blownTyre;
    @Column(name = "FLIPPED")
    private boolean flipped;
    @Column(name = "DIRTY")
    private boolean dirty;
    @Column(name = "DIRTY_DESCRIPTION")
    private String dirtyDescription;
    @Column(name = "FIRE")
    private boolean fire;
    @Column(name = "LOADED")
    private boolean loaded;
    @Column(name = "FLOODED")
    private boolean flooded;
}
