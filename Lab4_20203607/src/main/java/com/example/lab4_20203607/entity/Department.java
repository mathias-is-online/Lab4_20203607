package com.example.lab4_20203607.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    private int department_id;


    @Column(name = "department_name")
    private String department_name;

    @Column(name = "manager_id", nullable = false)
    private Integer manager_id;

    @Column(name = "location_id", nullable = false)
    private String location_id;


}
