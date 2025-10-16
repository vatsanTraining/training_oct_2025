package com.example.demo.day.one;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
public class Demo {
	
	
	
public static void printVersionOne(List<? extends Number> list) {
		
		list.forEach(System.out::println);
		
		System.out.println(list.get(1));
		//list.add(10); // Compile time error
	}


public static void printVersionTwo(List<Number> list) {
	
	list.forEach(System.out::println);
	
}

	public static void main(String[] args) {


		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		printVersionOne(list);
		//printVersionTwo(list);
		List<Double> list2 = Arrays.asList(1.1,2.2,3.3,4.4,5.5);
		printVersionOne(list2);
		
		List<Short> list3 = Arrays.asList((short)1,(short)2,(short)3,(short)4);
		printVersionOne(list3);
}
	
}
