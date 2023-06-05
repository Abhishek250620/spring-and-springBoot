package com.example.SB1.beans;

public class Book {
	private int id;
	private String bookTitle;
	public Book(int id, String bookTitle) {
		this.id = id;
		this.bookTitle = bookTitle;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

}
