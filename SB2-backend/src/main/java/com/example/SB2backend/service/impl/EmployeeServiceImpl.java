package com.example.SB2backend.service.impl;

import org.springframework.stereotype.Service;

import com.example.SB2backend.model.Employee;
import com.example.SB2backend.repository.EmployeeRespository;
import com.example.SB2backend.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRespository employeeRespository;
	
	public EmployeeServiceImpl(EmployeeRespository employeeRespository) {
		this.employeeRespository = employeeRespository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRespository.save(employee);
	}

}
