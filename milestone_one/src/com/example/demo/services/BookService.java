package com.example.demo.services;


import com.example.demo.Repository;
import com.example.demo.model.Book;

public class BookService {

	
	private Repository repo;

	public BookService(Repository repo) {
		super();
		this.repo = repo;
	}
	
	
	public boolean save(Book book) {
		
		return this.repo.save(book);
	}
	
	public Book[] findAll() {
		
		return this.repo.findAll();
	}
	
	
	public boolean remove(Book book) {
		
		return this.repo.remove(book);
	}
	
	
	public Book findByName(String bookName) {
		
		return this.repo.findByName(bookName);
	}
}
