package com.example.SB1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class StudentController {

	Student student;
	
	@Autowired
	public StudentController(Student student) {
		this.student = student;
	}

	void run() {
		System.out.println(student.study());
	}
}
