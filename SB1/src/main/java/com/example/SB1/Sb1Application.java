package com.example.SB1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Sb1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext c= SpringApplication.run(Sb1Application.class, args);
		StudentController sc = c.getBean("std2",StudentController.class);
//		System.out.println();
		sc.run();
//		Student std = c.getBean("std2",Student.class);
//		System.out.println(std.study());
	}

}
