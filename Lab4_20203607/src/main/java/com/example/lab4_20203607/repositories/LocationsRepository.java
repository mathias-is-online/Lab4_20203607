package com.example.lab4_20203607.repositories;

import com.example.lab4_20203607.entity.Department;
import com.example.lab4_20203607.entity.Locations;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.xml.stream.Location;

public interface LocationsRepository extends JpaRepository<Locations, Integer> {
}
