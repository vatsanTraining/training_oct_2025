package com.example.demo.services;
import com.example.demo.*;
public class BookService {

	/*
	 * First Iteration do with a Fixed Size
	 * Second Iteration do with a Resizable array
	 */
	
	private Book[] books;

	private final int MAXSIZE =5;
	
	private int count =0;
	
	public BookService() {

		this.books = new Book[MAXSIZE];
		
	}
	
	
	
	public boolean addBook(Book book) {
		
		boolean result =false;
		
		if(count<MAXSIZE) {
			this.books[count]=book;
			count++;
			result =true;
		}
		return result;
	}
	
	public boolean addAll(Book[] books) {
		
		return true;
	}
	
	public Book[] getBooks() {
		
		return this.books;
	}
	
	
	public Book findBookByName(String bookName) {
		
		return null;
	}
	
	
	public int getSize() {
		
		return 0;
	}
	
}
