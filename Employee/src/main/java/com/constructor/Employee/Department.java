package com.constructor.Employee;

public class Department {
	private String name;

	public Department(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + "]";
	}
	
}
