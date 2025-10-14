package com.example.demo;

import java.util.Scanner;

import com.example.demo.exceptions.RangeCheckException;
import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.services.BookService;

public class Application {

	public static void main(String[] args) {

		
		
		Repository repo = new BookRepository();
		
		BookService service = new BookService(repo);
		
		
		 Book java =null;
		
		 try (Scanner sc = new Scanner(System.in)) {
			
			 
			 System.out.println("Book Number");
			 
			 int bookNumber = sc.nextInt();
			 
			 sc.nextLine();
			 
			 System.out.println("Book Name");
			 
			 String bookName = sc.nextLine();
			 
			 System.out.println("Rate Per Book");
			 
			 double ratePerUnit = sc.nextDouble();
			 
			  java =new Book(bookNumber,bookName,ratePerUnit);
			 
			 System.out.println("Is Added:=>"+ service.save(java));
			 
			
		} catch (RangeCheckException e) {
			e.printStackTrace();
		}
		
		 
		   for(Book eachBook:service.findAll()) {
			   
			   if(eachBook!=null) {
			   System.out.println(eachBook);
			   }
		   }
		   
		   Book found = service.findByName("Head First Java");
		   
		   System.out.println("Found Book"+ found);
		   
		   
		   boolean isDeleted = service.remove(java);

		   
		   System.out.println("Deleted ===>"+ isDeleted);
		
	}

}
