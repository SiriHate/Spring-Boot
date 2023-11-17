package com.siri_hate.springboot3.dao;

import com.siri_hate.springboot3.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> { }
