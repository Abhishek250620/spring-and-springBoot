package com.example.SB1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.SB1.controller.StudentController;
import com.example.SB1.service.Student1;

@Configuration
public class AppConfig {

	@Bean
	public Student1 std1() {
		return new Student1();
	}
	
	@Bean(initMethod = "init",destroyMethod = "dest")
	public StudentController std2() {
		return new StudentController(std1());
	}
}
