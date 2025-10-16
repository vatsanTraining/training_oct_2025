package com.example.demo;

import com.example.demo.annotations.Invoker;
import com.example.demo.annotations.Table;

@Table(name = "book_2025")
public class Book {

	
	@Invoker(value = "Diwali")
	public String find(String val) {
		
		return val+"Added";
	}
}
