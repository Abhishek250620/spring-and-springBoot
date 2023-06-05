package com.example.SB1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.SB1.beans.Book;

@Controller
public class BookController {

	@RequestMapping("/hello-world")
	@ResponseBody
	public String helloword() {
		return "Hello World..!!!";
	}
	
	@RequestMapping("/book")
	@ResponseBody
	public Book getBook() {
		return new Book(1,"Java");
	}
}
