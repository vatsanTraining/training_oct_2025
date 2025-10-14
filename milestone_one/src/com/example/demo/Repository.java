package com.example.demo;
import com.example.demo.model.*;

/**
 * Repository To Manage CRUD Operations on an Array
 * @author srivatsan
 * @version 1.0
 */
public interface Repository {

	/**
	 * Array Size will grow automatically as elements are added
	 * @param book book to be added
	 * @return boolean value to denote element is added or not
	 */
	boolean save(Book book);
	
	/**
	 * Return all the Books in Array
	 * 
	 */
	Book[] findAll();
	/**
	 * Remove the Book from the array
	 * @param book book to be removed
	 * @return true on successful deletion 
	 */
	boolean remove(Book book);
	
	/**
	 * Find a Book By Name
	 * @param bookName name of the book to be searched
	 * @return Book Object
	 */
	Book findByName(String bookName);
	
}
