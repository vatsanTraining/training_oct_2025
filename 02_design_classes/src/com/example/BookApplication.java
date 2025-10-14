package com.example;

import java.util.Scanner;

import com.example.demo.Book;
import com.example.demo.services.BookService;

public class BookApplication {

	
	public static void printBooks(Book[] books) {
		
		for(Book eachBook:books) {
			if(eachBook!=null) {
			System.out.println(eachBook.getBookName() + eachBook.getRatePerUnit());
			}
		}
	}
	
	public static void main(String[] args) {
		
		
		Book java = new Book(1010, "Head First Java", 450);
		
		System.out.println(java.toString());
		
		//Book otherJava = java;
		//System.out.println("is Equal"+ java.equals(otherJava));
		
		Book anotherJava = new Book(1010, "Head First Java", 450);
		
		//System.out.println("Is Equal :=>"+ java.equals(new String("abc")));
		
		//System.out.println("Is Equal :=>"+ java.equals(null));
			
		
		BookService service = new BookService();
		
		Scanner sc = new Scanner(System.in);
		
		String choice ="add";
		
		while (!choice.equals("end")) {
		
		 switch (choice.toLowerCase()) {
		 
		case "add":
			
			 boolean result =service.addBook(anotherJava);
			 System.out.println("Is Added :=>"+result);
			
			break;
		case "find":
			 Book[] books = service.getBooks();
			 printBooks(books);
			 break;
		default:
			break;
		}
		 System.out.println("Enter the choice -find, find By name,size");
           choice = sc.next();
		}
		
		sc.close();
	}

}
