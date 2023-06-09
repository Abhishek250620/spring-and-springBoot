package com.constructor.Employee;

import java.util.Map;

public class Employee {
	
	private  int id;
	private String name;
	private double salary;
	private Department dept;
	private Map<String, String> project;
	
	public Employee(int id, String name, double salary, Department dept, Map<String, String> project) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.project = project;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + ", project="
				+ project + "]";
	}
	
}
