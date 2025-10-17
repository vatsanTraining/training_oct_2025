package com.example.demo.repo;

import java.util.Arrays;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class NameRepository {


	

	List<String> names;
	String bestName;
	
	public NameRepository() {
		
		
	}
	
	@Autowired     //Constructor Injection , we need not add @autowired , since there is only one constructor, 
	public NameRepository(List<String> names,@Qualifier("alpha") String name) {
		
		this.names = names;
		this.bestName =name;
		
	}
	
	
	public List<String> getNames(){
		
		//return Arrays.asList("Ram","Shyam","Vaishali");
		
		return this.names;
	}
	
	
	
	
	public String getBestName() {
		
		return this.bestName;
	}
}
