package com.example.SB1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Autowired
	private Demo1 demo1;
	public void run() {
		demo1.run1();
	}
}
