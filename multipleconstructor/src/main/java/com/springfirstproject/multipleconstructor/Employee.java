package com.springfirstproject.multipleconstructor;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {
	
	private int id;
	private String name;
	
	public Employee(int id) {
		System.out.println("int const");
		this.id = id;
	}
	
	public Employee(String name) {
		System.out.println("String const");
		this.name = name;
	}
	
//	public void init() {
//		System.out.println("Bean created...!!!!");
//	}
//	
//	public void destroy() {
//		System.out.println("Bean destroyed...!!!!");
//	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean created...!!!");
	}

	public void destroy() throws Exception {
		System.out.println("Bean destroyed...!!!");
	}
}
