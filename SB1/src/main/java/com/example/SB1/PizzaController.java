package com.example.SB1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("pz")
public class PizzaController {

	@Autowired
	@Qualifier("nonVegPizza")
	private Pizza pizza;

	void dis() {
		System.out.println(pizza.getPizza());
	}

}
