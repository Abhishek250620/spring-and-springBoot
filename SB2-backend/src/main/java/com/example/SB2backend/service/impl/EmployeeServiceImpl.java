package com.example.SB2backend.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.SB2backend.exception.ResourceNotFoundException;
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

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRespository.findAll();
	}

	@Override
	public Employee getEmployeeById(Long id) {
		Optional<Employee> employee = employeeRespository.findById(id);
		if(employee.isPresent()) {
			return employee.get();
		}
		else {
			throw new ResourceNotFoundException("Employee", "ID", id);
		}
	}

	@Override
	public Employee updateEmployeeById(Employee employee, Long id) {
		Employee existingEmployee = employeeRespository.findById(id).orElseThrow( 
				()-> new ResourceNotFoundException("Employee", "ID", id));
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());
		employeeRespository.save(existingEmployee);
		return existingEmployee;
	}

	@Override
	public void deleteEmployeeById(Long id) {
		employeeRespository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee", "ID", id));
		employeeRespository.deleteById(id);
	}

}
