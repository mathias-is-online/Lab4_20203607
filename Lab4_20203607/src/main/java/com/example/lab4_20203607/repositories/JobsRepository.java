package com.example.lab4_20203607.repositories;

import com.example.lab4_20203607.entity.Empleados;
import com.example.lab4_20203607.entity.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobsRepository extends JpaRepository<Jobs, Integer> {
}
