package com.example.lab4_20203607.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "jobs")
public class Jobs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private int job_id;


    @Column(name = "job_title")
    private String job_title;

    @Column(name = "min_salary",nullable = false)
    private int min_salary;

    @Column(name = "max_salary",nullable = false)
    private int max_salary;


}
