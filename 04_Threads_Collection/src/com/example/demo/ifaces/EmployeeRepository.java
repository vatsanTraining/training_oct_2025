package com.example.demo.ifaces;
import java.util.*;
public interface EmployeeRepository<T> extends CrudReposiotry<T> {

	
	Collection<T> sortedList(Comparator<T> comp);
	Collection<T> findByEmployeeName(String name);
	
	
}
