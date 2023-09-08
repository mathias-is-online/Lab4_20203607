package com.example.lab4_20203607.repositories;

import com.example.lab4_20203607.entity.Department;
import com.example.lab4_20203607.entity.Empleados;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
