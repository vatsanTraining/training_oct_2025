package com.training;

public class Book {
	
	
	private int bookId;
	private String bookName;
	
	
	// Initialisation Block
	{
		System.out.println(" Inside Init Block -I");
		
		this.bookId =101;
		this.bookName="Head First Java";
	}
	{
		System.out.println("Inside Init Block -2");
	}

	static {
		System.out.println("Inside Static Block");
	}
	
	public Book() {
		
		System.out.println("Inside Constructor");
	}
	

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	

	
}
