package com.example.SB1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.SB1.controller.MyController;
import com.example.SB1.controller.StudentController;
import com.example.SB1.lazy.LazyLoader;
import com.example.SB1.repository.MyRepository;
import com.example.SB1.scope.ProtoTypeBean;
import com.example.SB1.scope.SingleTonBean;
import com.example.SB1.service.MyService;
import com.example.SB1.value.ValueDemo;

@SpringBootApplication
public class Sb1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(Sb1Application.class, args);
//		StudentController sc = c.getBean("std2",StudentController.class);
//		System.out.println();
//		sc.run();
//		Student std = c.getBean("std2",Student.class);
//		System.out.println(std.study());
		
		MyController myController = context.getBean(MyController.class);
		System.out.println(myController.hello());
		
		MyService myService = context.getBean(MyService.class);
		System.out.println(myService.hello());
		
		MyRepository myRepository = context.getBean(MyRepository.class);
		System.out.println(myRepository.hello());
		
		LazyLoader lazyLoader = context.getBean(LazyLoader.class);
		
		SingleTonBean singleTonBean1 = context.getBean(SingleTonBean.class);
		SingleTonBean singleTonBean2 = context.getBean(SingleTonBean.class);
		SingleTonBean singleTonBean3 = context.getBean(SingleTonBean.class);
		
		ProtoTypeBean protoTypeBean1 = context.getBean(ProtoTypeBean.class);
		ProtoTypeBean protoTypeBean2 = context.getBean(ProtoTypeBean.class);
		ProtoTypeBean protoTypeBean3 = context.getBean(ProtoTypeBean.class);
		
		ValueDemo valueDemo = context.getBean(ValueDemo.class);
		valueDemo.meth();
	}

}
