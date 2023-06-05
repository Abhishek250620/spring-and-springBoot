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

	@Value("${Java_Home}")
	private String javaHome;

//	@Value("${HOME}")
//	private String homeDir;
	
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void meth() {
		System.out.println(name);
		System.out.println(javaHome);
//		System.out.println(homeDir);
	}
}
