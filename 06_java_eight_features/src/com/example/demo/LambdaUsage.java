package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


// Using a StandAlone Class to Implement an Functional Interface

class Conditional implements Predicate<String>{

	@Override
	public boolean test(String t) {
		return t.startsWith("A");
	}
	
	
}


public class LambdaUsage {

	
	public static double calculate(Function<Double,Double> lambda ,double arg) {
		
		return lambda.apply(arg);
	}
	
	
	
	// Lambdas can be argument to a method
	
	public static void printNames(List<String> names,Predicate<String> conditinal) {
	
	//	names.forEach((e) -> conditinal.test(e));
		
		names.forEach((e) ->{
			
			if(conditinal.test(e)) {
				System.out.println("Names Starting With A"+e);
			}
		});
	}
	
	
	// Lambdas can be returned from  a method

	
	public static Supplier<Predicate<Integer>> getPredicate(int key){
		
		
			Predicate<Integer> grtThan = (e) -> e>80;

			
			Supplier<Predicate<Integer>> supplier = () ->  grtThan;
			
			
		//return grtThan;
		
			return supplier;
		
	}
	public static void main(String[] args) {

		
		
		Predicate<String> demoOne = new Conditional();
		
		System.out.println(demoOne.test("Ashish"));
		
		
// Using Annonymous Class to Implement a Functional Interface		
		
		Predicate<String> annon = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				return t.startsWith("A");
			}
		};
		
		System.out.println(annon.test("Ambre"));
		
// Using Lambda to implement a Functional Interface - Concise and less verbose
		
		Predicate<String> testForChar = (t) -> t.startsWith("A");
		
		
		
		
		System.out.println(testForChar.test("Abishek"));
		
		
		List<String> names =Arrays.asList("Hari","Kari","Worry","Abhi");
		
		printNames(names, testForChar);
		
		
		List<Integer> marks =Arrays.asList(65,75,89,90);
		
		  Supplier<Predicate<Integer>> cond =  getPredicate(1);
		  

		marks.forEach((e) ->{
			
			    System.out.println("Is Grt Than 80:=>"+cond.get().test(e));
		});
		
		
		
		Function<Double,Double>  milesToKms = (miles) -> miles * 1.609;
		
		System.out.println(calculate(milesToKms, 200));
		
	    Function<Double,Double>   celToFaren =	(cel) -> cel*(9.0/5.0)+32.0;	
	    
	    System.out.println(calculate(celToFaren, 42));
	    
	    
	    BiPredicate<Integer, Integer>  testForGrt =  (mark,condition) -> mark >condition;
	    
	    int mathsMark =67;
	    
	    int scienceMark =87;
	    
	    System.out.println("Mark Greater than 80 =>"+testForGrt.test(mathsMark, 80));
	    

	    System.out.println("Mark Greater than 80 =>"+testForGrt.test(scienceMark, 80));
	    
	    
	   // BiPredicate<String, String>  testForAmp =  (srchString,crit) -> srchString.contains(crit);
	    

	    BiPredicate<String, Integer>  testForLength =  (srchString,leng) -> srchString.length()>leng;

//	    BiPredicate<String, Integer>  testForLengthLess =  (srchString,leng) -> srchString.length()<leng;

	    
	   System.out.println("Is String grt Then 8 chars" +testForLength.test("Hello World", 8));
	   
	   
	   System.out.println("Is String less Then 8 chars" +testForLength.negate().test("Hello World", 8));
	   
	   
	    
	   
	   Predicate<String> testContainsA = (t) -> t.startsWith("A");
		
		
		
		
		System.out.println(testContainsA.test("Abishek"));
		


		
		// using the default method and write contains B and C
		
		   Predicate<String> testContainsBandC  = (e) -> e.contains("B");
		   
		   
		  System.out.println("CHECKING A and C IN ACB" +testContainsBandC.and(e -> e.contains("C")).test("ACB"));
		   

		  System.out.println("CHEKCING A and C IN PQR"+testContainsBandC.and(e -> e.contains("C")).test("PQR"));


		   

	}

}
