package com.example.SB1.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.SB1.beans.Book;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/api")
public class BookController {

	@RequestMapping(value = {"/hello-world","/hello"})
//	@ResponseBody
	public String helloword() {
		return "Hello World..!!!";
	}
	
//	@RequestMapping(value = {"/book"})
	//	@ResponseBody
	@GetMapping("/book")
	public Book getBook() {
		return new Book(1,"Java");
	}
	
	@PostMapping(value = "/books/create", 
			consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.CREATED)
	public Book createBook(@RequestBody Book book) {
		System.out.println(book.getId());
		System.out.println(book.getBookTitle());
		return book;
	}
}
