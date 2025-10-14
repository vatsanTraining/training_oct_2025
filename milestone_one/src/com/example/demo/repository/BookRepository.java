package com.example.demo.repository;

import com.example.demo.Repository;
import com.example.demo.model.Book;

public class BookRepository implements Repository {

	private Book[] books;
	private int idx=0;
	
	
	public BookRepository() {
		super();
		
		this.books = new Book[3];
	}

	@Override
	public boolean save(Book book) {
		// TODO Auto-generated method stub
		
		this.books[idx]=book;
		idx++;
		return true;
	}

	@Override
	public Book[] findAll() {
		// TODO Auto-generated method stub
		return this.books;
	}

	@Override
	public boolean remove(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Book findByName(String bookName) {
		// TODO Auto-generated method stub
		return null;
	}

}
