package com.springproject.ConfigWithoutXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.springproject.ConfigWithoutXML")
public class FoodDeliveryConfig {

	@Bean("a")
	public FoodDelivery foodDel() {
		return new FoodDelivery();
	}
}
