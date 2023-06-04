package com.example.SB1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Student2  implements Student{

	@Override
	public String study() {
		return "Student2 studing science";
	}

}
