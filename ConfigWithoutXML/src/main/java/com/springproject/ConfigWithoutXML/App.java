package com.springproject.ConfigWithoutXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(FoodDeliveryConfig.class);
    	FoodDelivery fd = context.getBean("foodDelivery",FoodDelivery.class);
    	System.out.println(fd);
    	fd.deliver();
    	System.out.println(context.getBean("a"));
    }
}
