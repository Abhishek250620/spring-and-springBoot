package com.example.SB2backend.service;

import java.util.List;

import com.example.SB2backend.model.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(Long id);
	Employee updateEmployeeById(Employee employee,Long id);
}
