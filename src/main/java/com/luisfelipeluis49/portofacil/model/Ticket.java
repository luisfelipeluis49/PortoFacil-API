package com.luisfelipeluis49.portofacil.model;

import jakarta.persistence.*;
import lombok.Data;

@Data @Entity @Table(name = "T_PF_TICKET")
public class Ticket {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TICKET")
    private long id;
    @Column(name = "OPEN_TICKET")
    private boolean open;
    @OneToOne
    @JoinColumn(name = "ID_TOW_TRUCK", referencedColumnName = "ID_TOW_TRUCK")
    private TowTruck towTruck;
    @OneToOne
    @JoinColumn(name = "ID_TRUCK", referencedColumnName = "ID_TRUCK")
    private Truck truck;
    @OneToOne
    @JoinColumn(name = "ID_PROBLEM", referencedColumnName = "ID_PROBLEM")
    private Problem problem;
    @OneToOne
    @JoinColumn(name = "ID_TRUCK_CONDITIONS", referencedColumnName = "ID_TRUCK_CONDITIONS")
    private TruckConditions truckConditions;
    @OneToOne
    @JoinColumn(name = "ID_ROAD_CONDITIONS", referencedColumnName = "ID_ROAD_CONDITIONS")
    private RoadConditions roadConditions;
    @OneToOne
    @JoinColumn(name = "ID_LOCATION", referencedColumnName = "ID_LOCATION")
    private Location location;
    @OneToOne
    @JoinColumn(name = "ID_WEATHER", referencedColumnName = "ID_WEATHER")
    private Weather weather;
}
