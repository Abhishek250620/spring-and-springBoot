package com.example.SB2backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SB2backend.model.Employee;
import com.example.SB2backend.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
//	@Autowired
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	//Build create Employee Rest Api
	@PostMapping()
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee),HttpStatus.CREATED);
	}
	
	//Build getAll Employee Rest Api
	@GetMapping()
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	//Build getEmpoyeeById Rest Api
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeByID(@PathVariable("id") Long id){
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(id), HttpStatus.OK);
	}
	
	//Build updateEmployeeById Rest Api
	@PutMapping("{id}")
	public ResponseEntity<Employee> updateEmployeeById(@PathVariable("id") Long id, @RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.updateEmployeeById(employee, id), HttpStatus.OK);
	}
	
	//Build deleteEmployeeById Rest Api
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEmployeeById(@PathVariable Long id){
		employeeService.deleteEmployeeById(id);
		return new ResponseEntity<String>("Employee deleted successfully..!!", HttpStatus.OK);
	}
}
