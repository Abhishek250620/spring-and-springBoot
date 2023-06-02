package com.example.SB1;

import org.springframework.stereotype.Component;

@Component
public class Student1 implements Student {

	@Override
	public String study() {
		return "Student1 studing Maths";
	}

}
