package com.example.demo.streams;

import java.util.stream.IntStream;

public class MiscStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		IntStream marks = IntStream.of(12,11,20,41,45,55,67,89,29);
		
	
		
		// marks.filter(element -> element >60).forEach(System.out::println);
		
		
		//System.out.println("ALL MATCH");
		
		
    	 // System.out.println("All Students Mark > 20 =>"+marks.allMatch(e -> e>20));

		
		//System.out.println("Any MATCH");
		
	//	System.out.println("Any Students Mark > 90 =>"+marks.anyMatch(e -> e<8));

		
		
	//	System.out.println("NONE MATCH");
	
		//System.out.println("None Match =>"+marks.noneMatch(e -> e>8));

		
		
	// System.out.println("Find First" +marks.filter( e -> e>40).findFirst().getAsInt());
	 

	 System.out.println("Find Any" +marks.filter( e -> e>40).findAny().getAsInt());

		
		
	}

}
