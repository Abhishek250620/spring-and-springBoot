package com.abhi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepo std;
	
	@RequestMapping("home")
	String display1() {
		return "home.jsp";
	}
	
	@RequestMapping("add")
	String display2(Student s) {
		std.save(s);
		return "home.jsp";
	}
}
