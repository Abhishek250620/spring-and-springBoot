package com.example.SB1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Sb1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext c= SpringApplication.run(Sb1Application.class, args);
		StudentController sc = c.getBean("studentController",StudentController.class);
		sc.run();
	}

}
