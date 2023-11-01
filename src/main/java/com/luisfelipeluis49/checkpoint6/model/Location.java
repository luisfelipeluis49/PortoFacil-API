package com.luisfelipeluis49.checkpoint6.model;

import lombok.Data;

@Data
public class Location {
    private long id;
    private String zipcode;
    private String thoroughfare;
    private int km;
    private int num;
    private String reference;
}
