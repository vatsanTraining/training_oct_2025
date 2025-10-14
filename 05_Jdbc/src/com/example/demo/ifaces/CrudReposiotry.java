package com.example.demo.ifaces;
import java.util.*;

public interface CrudReposiotry<T> {
	
	boolean add(T t); 
	T findById(int id);
	boolean remove(int id);
	Collection<T> findAll();
	
	

}
