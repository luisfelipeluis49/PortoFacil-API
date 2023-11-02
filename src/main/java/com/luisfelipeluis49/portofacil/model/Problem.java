package com.luisfelipeluis49.portofacil.model;

import jakarta.persistence.*;
import lombok.Data;

@Data @Entity @Table(name = "T_PF_PROBLEM")
public class Problem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PROBLEM")
    private long id;
    @Column(name = "OCCURRENCES")
    private int occurrences;
    @Column(name = "PROBLEM_DESCRIPTION")
    private String description;
    @Column(name = "PROBLEM_NAME")
    private String name;
}
