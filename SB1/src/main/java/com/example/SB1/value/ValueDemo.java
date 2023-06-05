package com.example.SB1.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueDemo {

	@Value("Acuver")
	private String name;
	
	@Value("${mail.host}")
	private String host;
	
	@Value("${mail.email}")
	private String email;
	
	@Value("${mail.password}")
	private String password;
	
	public void meth() {
		System.out.println(name);
		System.out.println(host);
		System.out.println(email);
		System.out.println(password);
		
	}
}
