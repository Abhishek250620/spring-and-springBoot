package com.example.SB1.lazy;

import org.springframework.stereotype.Component;

@Component
public class EagerLoader {

	public EagerLoader() {
		System.out.println("Eagerloader...");
	}
}
