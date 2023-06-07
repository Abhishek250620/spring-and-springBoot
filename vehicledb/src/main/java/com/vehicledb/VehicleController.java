package com.vehicledb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class VehicleController {
	
	@Autowired
	VehicleRepo repo;
	
	@RequestMapping("home")
	String display1() {
		return "home.jsp";
	}
	
	@RequestMapping("addVehicle")
	String display2(Vehicle v) {
		repo.save(v);
		return "home.jsp";
	}
	
	@RequestMapping("getById")
	String display3(int vid,HttpSession s) {
		Vehicle v=repo.findById(vid).orElse(null);
		s.setAttribute("value", v);
		return "home.jsp";
	}
	
	@RequestMapping("getByColor")
	String display4(String color,HttpSession s) {
		List<Vehicle> v=repo.findByColor(color);
		s.setAttribute("value1", v);
		return "home.jsp";
	}
	
	@RequestMapping("vehicleAfterTwenty")
	String display5(HttpSession s) {
		List<Vehicle> v=repo.vehicleAfterTwenty();
		s.setAttribute("value2", v);
		return "home.jsp";
	}
}
