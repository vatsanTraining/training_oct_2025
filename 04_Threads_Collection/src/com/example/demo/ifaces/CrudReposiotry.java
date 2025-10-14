package com.example.demo.ifaces;
import java.util.*;

import com.example.demo.execeptions.ElementAleadyExistException;
import com.example.demo.execeptions.NotFoundException;
public interface CrudReposiotry<T> {
	
	boolean add(T t) throws ElementAleadyExistException;
	T findById(int id) throws NotFoundException;
	boolean remove(int id);
	Collection<T> findAll();
	
	

}
