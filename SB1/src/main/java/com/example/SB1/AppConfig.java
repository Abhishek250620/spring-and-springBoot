package com.example.SB1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
