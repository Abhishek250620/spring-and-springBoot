package com.example.SB2backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SB2backend.model.Employee;

public interface EmployeeRespository extends JpaRepository<Employee, Long>{

}
