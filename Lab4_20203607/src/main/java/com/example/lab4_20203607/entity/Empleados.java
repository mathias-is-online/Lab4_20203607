package com.example.lab4_20203607.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Entity
@Getter
@Setter
@Table(name = "employees")
public class Empleados {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int employee_id;


    @Column(name = "first_name", nullable = false)
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "phone_number", nullable = false)
    private String phone_number;

    @Column(name = "hire_date")
    private Date hire_date;

    @Column(name = "job_id")
    private String job_id;

    @Column(name = "salary", nullable = false)
    private Double salary;

    @Column(name = "commission_pct", nullable = false)
    private Double commission_pct;

    @Column(name = "manager_id", nullable = false)
    private int manager_id;

    @Column(name = "department_id", nullable = false)
    private int department_id;

    @Column(name = "enabled", nullable = false)
    private int enabled;



}
