package com.example.demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

import com.example.demo.module.three.Employee;

public class OtherCollectionClasses {
	
	
	public static void usingHashSet(Collection<Employee> empList) {
		
		
		HashSet<Employee> empSet = new HashSet<>();
		
		empSet.add(new Employee(89, "Jaga","Singhad", 892349));
		
		 empSet.addAll(empList);
		 
		 
		 print(empSet);
	}

	private static void print(Set<Employee> empSet) {
		
		for(Employee eachEmployee : empSet) {
			 
			 System.out.println(eachEmployee);
		 }
	}
	
	public static void usingTreeSet() {
		
		
       TreeSet<Employee> empSet = new TreeSet<>();
		
		System.out.println( "Added :=>"+empSet.add(new Employee(89, "Jaga","Singhad", 892349)));
		
		System.out.println( "Added :=>"+empSet.add(new Employee(89, "Jaga","Singhad", 892349)));
		
		 
		 
		 print(empSet);

	}
	
	public static Map<Integer,Employee>  usingHashMap() {
		
		HashMap<Integer, Employee> empMap = new HashMap<>();

		System.out.println( "Added :=>"+empMap.put(89,new Employee(89, "Jaga","Singhad", 892349)));
		
		System.out.println( "Added :=>"+empMap.put(90,new Employee(99, "Loga","Viman", 892349)));

		System.out.println( "Added :=>"+empMap.put(90,new Employee(888, "Shiv","Karadi", 74849)));


		return empMap;
	}
	
	public static void iteratingMap(Map<Integer,Employee> empMap) {
		
		
			Set<Map.Entry<Integer,Employee>> setView = empMap.entrySet();
			
			for(Map.Entry<Integer, Employee> eachEntry:setView) {
				
				System.out.println(eachEntry.getKey()  +"," +eachEntry.getValue());
			}

		}

	public static Collection<Employee> init() {
		
		return Arrays.asList(
		
	    new Employee(1010, "Ganesh", "Chennai", 89000),
		new Employee(1020, "Kumaresh", "Pune", 79000),
		new Employee(1030, "Rakesh", "Satara", 99000)
      );
		
		
	
	}
	
	public static void fetchBrowsingHistory() {
		
		
		LinkedList<String> history = new LinkedList<String>();
		
		
		history.add("1-home");
		history.add("2-contact");
		history.add("3-gallery");
		
		ListIterator<String> itr = history.listIterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		while(itr.hasPrevious()) {
			
			System.out.println(itr.previous());
		}
		
		System.out.println("Current Page :=>"+itr.next());
		System.out.println("Current Page :=>"+itr.next());
		System.out.println("Current Page :=>"+itr.previous());	
		
	}
	public static void main(String[] args) {

		//usingHashSet(init());
		
		// usingTreeSet();
		
		
	   Map<Integer,Employee> empMap= usingHashMap();
		
	   iteratingMap(empMap);
	   
	   
	  List<String> nameList = new ArrayList<>();
	   
	  // CopyOnWriteArrayList<String> nameList = new CopyOnWriteArrayList<>();

	   nameList.add("Ramesh");
	   nameList.add("Suresh");
	   nameList.add("Magesh");
	   
	   
	   // TODO
	   //Iterate through this list while iterating add or remove an element to the list 
	   // observe the result
	   
	   Iterator<String> itr = nameList.iterator();
	   
	   while(itr.hasNext()) {
		   
		   String eachName = itr.next();
		   
		   System.out.println(eachName);
		   
		   if(eachName.equals("Suresh")) {
			   
			   nameList.add("Logesh");
			   nameList.remove("Ramesh");
		   }
	   }
	   
	   
	   
	   fetchBrowsingHistory();
	}

}
