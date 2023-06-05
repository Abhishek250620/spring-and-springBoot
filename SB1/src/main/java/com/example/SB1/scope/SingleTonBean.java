package com.example.SB1.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingleTonBean {
	
	public SingleTonBean() {
		System.out.println("SingleTonBean created...");
	}

}
