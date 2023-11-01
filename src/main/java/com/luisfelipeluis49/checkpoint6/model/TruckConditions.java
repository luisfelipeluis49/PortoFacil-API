package com.luisfelipeluis49.checkpoint6.model;

import lombok.Data;

@Data
public class TruckConditions {
    private long id;
    private boolean crashed;
    private boolean blownTyre;
    private boolean flipped;
    private boolean dirty;
    private String dirtyDescription;
    private boolean fire;
    private boolean loaded;
    private boolean flooded;
}
