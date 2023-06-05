package com.example.SB1.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueDemo {

	@Value("Acuver")
	private String name;
	
	public void meth() {
		System.out.println(name);
	}
}
