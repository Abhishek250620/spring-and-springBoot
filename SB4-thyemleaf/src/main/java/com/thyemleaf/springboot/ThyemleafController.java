package com.thyemleaf.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThyemleafController {

	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("message","Hello word..!!!");
		return "index";
	}
}
