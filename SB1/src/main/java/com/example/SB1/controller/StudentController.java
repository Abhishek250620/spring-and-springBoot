package com.example.SB1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.SB1.service.Student;

//@Component
public class StudentController {

	Student student;
//	
//	@Autowired
	public StudentController(Student student) {
		this.student = student;
	}

	public void run() {
		System.out.println(student.study());
	}
	
	public void init() {
		System.out.println("initalization logic...!!!");
	}
	
	public void dest() {
		System.out.println("Destroy logic...!!!");
	}
}
