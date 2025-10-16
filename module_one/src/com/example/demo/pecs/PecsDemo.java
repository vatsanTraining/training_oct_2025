package com.example.demo.pecs;
// Producer Extends Consumer Super
import java.util.*;
import java.util.function.Function;
import com.example.demo.*;
public class PecsDemo {


	public static void method(List<Number> list) {
	
		list.forEach(System.out::println);
	}

	
	
	// Upper Bound --Read only - cannot write
	public static void  prodMethod(List<? extends Number> list) {

		list.forEach(System.out::println);

		System.out.println(list.get(1));
		
		//POint -4
		
		// list.add(Integer.valueOf(200));    only produces but not consume
		
		// list.set(2, 67);
		
		
	}
	// Lower Bound - Write Only - Read only 
	public static void consMethod(List<? super Number> list) {

		list.forEach(System.out::println);
		
		System.out.println(list.get(1)); 
		
		list.add(Integer.valueOf(23));   // consumer
		
		list.set(2, 67);          // consumer
		
	}
	
	
	public static void superAgain(List<? super PolarBear> list) {
		
		
		list.add(new PolarBear());
		
		list.add(new SouthPolarBear());
		
		//list.add(new TeddyBear());
	}
	
	public static void main(String[] args) {
		
		
		List<Number> numberList = Arrays.asList(10,20,30,40);
				
	   List<Integer> integerList =Arrays.asList(888,999,777,666);
	   
	   List<Double>  doubleList = Arrays.asList(111.00,222.00,333.0);
	   
	   
	   
	   //Point -One
	   
	   method(numberList);
	   // method(integerList);   
	   // even though Integer is a subclass of Number since the argument to the method 
	   //expects List<Number> we cannot pass a List<Integer>
	   
	   // method(doubleList);
	   
	   //===============
	   
	   //Point -Two
	   
	   
	   // since all the three are sub classes of Number and method uses extends it compiled without error
	   prodMethod(numberList);
	   prodMethod(doubleList);
	   prodMethod(integerList);
	   
	   // =================
	   
	   Function<Integer, Integer> abc;
	   
	   // Point Three
	   
	   consMethod(numberList);
	  //consMethod(doubleList);
	  //consMethod(integerList);
	   
	}
}
