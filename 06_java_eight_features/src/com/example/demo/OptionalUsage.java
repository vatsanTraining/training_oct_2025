package com.example.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.management.RuntimeErrorException;

public class OptionalUsage {

	
	
	public Map<Integer,String> list;
	
	
	
	public OptionalUsage() {
		
		
		this.list = new HashMap<>();
		
		this.list.put(1,"Anand");
		
		this.list.put(2,"Chetan");
		
		this.list.put(3,"Vikas");
		
		this.list.put(4,"Sheetal");
		
		this.list.put(5,"Jockey");
	}
	
	
	// the return value may be null if no matching value is found
	
	public String srchName(int key) {
		
		return this.list.get(key);
	}
	
	
	// return value will be a optional with a value or not
	
	public Optional<String> srchNameCaseTwo(int key){
		
		
		return Optional.ofNullable(this.list.get(key));
		
		
	}
	
	public static void main(String[] args) {
		
		
		OptionalUsage obj = new OptionalUsage();
		
		System.out.println(obj.srchName(2).length());
		
	 System.out.println(obj.srchNameCaseTwo(35).orElseGet(() -> "default value"));
		
		obj.srchNameCaseTwo(23).ifPresent(e -> System.out.println(e.length()));
		

		
		if(obj.srchNameCaseTwo(23).isPresent()){
			
			System.out.println(obj.srchNameCaseTwo(23).get());
		}else {
			
			System.out.println("Element Not Present");
		}
		
		obj.srchNameCaseTwo(43).orElseThrow(()-> new RuntimeException("Invalid Choice"));
		
	}
	
}
