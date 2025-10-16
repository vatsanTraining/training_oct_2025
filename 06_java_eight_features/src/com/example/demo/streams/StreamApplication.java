package com.example.demo.streams;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class StreamApplication {

	// Using Map
	
	
	public static void findAverageAge(List<BloodDonor> list) {
		
		
		
	
	
		OptionalDouble average =list.stream().mapToDouble(e -> e.getDonorAge()).average();
		
		
		if(average.isPresent()){
			
			System.out.println("Average Age of Donors:=>"+average.getAsDouble());
		} 
		
		
	}
	
	
	public static void findDistinctGroups(List<BloodDonor> list) {
		
		//use Distinct statefull
		
	}
	
	public static void sortByDateDonated(List<BloodDonor> list) {
		
		
		//usesort with Comparator.comparing  stateful  
	}
	
	
	public static void sortByGroupAndDateDonoated(List<BloodDonor> list) {
	
		//use thenComparing  //stateful
		
		list.stream().
		     sorted(Comparator.comparing(BloodDonor::getBloodGroup)
		    		  .thenComparing(Comparator.comparing(BloodDonor::getDonorAge).reversed()))
		     .forEach(System.out::println);
		
		System.out.println("===================================");
		list.stream().
	     sorted(Comparator.comparing(BloodDonor::getBloodGroup)
	    		  .thenComparing(Comparator.comparing(BloodDonor::getDonorAge)))
	     .forEach(System.out::println);
	
	}
	
	public static void getTheSeniorDonorByAge(List<BloodDonor> list) {
		
		Stream<Integer> mystream =list.stream().map(e ->e.getDonorAge());
		

		
	Optional<Integer>	maxValue= mystream.max(Comparator.comparing(Integer::intValue));
	
	//Optional<Integer>	minValue= mystream.min(Comparator.comparing(Integer::intValue));
	
	     if(maxValue.isPresent()) {
	    	 
	    	System.out.println("Senior Most Donor:=>" +maxValue.get());
	    	 //System.out.println("Youngest Donor :=>"+ minValue.get());
	     }
	}
	
	// Using Filter 
	
	
	
	public static void filterByBloodGroup(Predicate<BloodDonor> conditionl,List<BloodDonor>  list) {
		
		
		List<BloodDonor> subList = list.stream().filter(conditionl).collect(toList());
		
		print(subList);
		
	}
	
	public static void filterByBloodGroup(BloodGroup group,List<BloodDonor> list) {
		
		
		LinkedList<BloodDonor> subList = list.stream().filter(e -> e.getBloodGroup().equals(group))
				                 .collect(toCollection(LinkedList<BloodDonor>::new));
		
		System.out.println("First in the List:=>"+subList.getFirst().getDonorName());
		
		System.out.println("Last in the List:=>"+subList.getLast().getDonorName());

		print(subList);
	}
	
	
	public static void filterAndMap(BloodGroup group,List<BloodDonor> list) {
		
		
	Map<String,Long>	listByName=list.stream().filter(e -> e.getBloodGroup().equals(group))
				.collect(toMap(BloodDonor::getDonorName, BloodDonor::getMobileNumber));
		  
	
	    System.out.println(listByName.get("Kambli"));
	    
	
	       listByName.entrySet().forEach((e) -> System.out.println(e.getKey() + "\t"+e.getValue()));
	
	}
	
	public static void print(List<BloodDonor> list) {
		
		
		list.forEach(System.out::println);
		
		list.stream().forEach(System.out::println);
		
	}
	
	
	
	public static void main(String[] args) {

		
		List<BloodDonor> donors = new BloodGroupRepoImpl().findAll();
		
	//	filterByBloodGroup((e) -> e.getBloodGroup().equals(BloodGroup.BPOS), donors);
		
		
	//	filterByBloodGroup(BloodGroup.APOS, donors);
	
		//filterAndMap(BloodGroup.BPOS, donors);
		
		
		//findAverageAge(donors);
		
		//sortByGroupAndDateDonoated(donors);
		
		//getTheSeniorDonorByAge(donors);
		
		// Map<BloodGroup, List<BloodDonor>>  map=donors.stream().collect(Collectors.groupingBy(BloodDonor::getBloodGroup));
		
		
		 Map<BloodGroup, Set<BloodDonor>>  map=donors.stream()
				 .collect(Collectors.groupingBy(BloodDonor::getBloodGroup,Collectors.toSet()));
			
		 
		 map.get(BloodGroup.ANEG).forEach(System.out::println);

		 
		 LocalDate depositDate = LocalDate.of(2025, 10, 12);
		 
		 // what will be maturity date if amount is deposited for 45 days
		 
		 
		 LocalDateTime time  = LocalDateTime.now();
		 
		 // the session should be completed in next 45 minutes , if so what will be end time
		 
		 
		 List<String> names = Arrays.asList("Vengsarkar", "Kambli", "Tendulkar", "Hazare", "Agarwal");
		 
		List<String> newList = names.stream().filter(e ->e.length()>7).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		 
		 
		newList.forEach(System.out::println);
		
		
		 
	}

}
