package com.example.lab4_20203607.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "locations")
public class Locations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private int location_id;


    @Column(name = "street_address",nullable = false)
    private String street_address;

    @Column(name = "postal_code", nullable = false)
    private String postal_code;

    @Column(name = "city")
    private String city;

    @Column(name = "state_province", nullable = false)
    private String state_province;

    @Column(name = "country_id", nullable = false)
    private String country_id;

}
