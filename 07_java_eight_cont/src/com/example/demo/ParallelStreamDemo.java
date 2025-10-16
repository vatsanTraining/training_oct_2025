package com.example.demo;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	Optional<Integer> total=	 Stream.of(1,2,3,4,5,6,7,8,9,10).parallel().filter(e -> e>0)
		    .peek((e) -> System.out.println(Thread.currentThread().getName()))
		    .reduce(Integer::sum);
		
		
		total.ifPresent(e ->System.out.println("Total:=>"+e));
		
	
		System.out.println("Available Processor :="+Runtime.getRuntime().availableProcessors());
		
		
//		int sumOfNumbers = Stream.of(1,2,3,4,5).parallel()
//				.reduce(Integer::sum);
//			
//			
//			System.out.println("Total:=>"+sumOfNumbers);
//		
			
			long[] numbers = {1,2,3};
			
			  long initial = 3L;
			    long sum =0L;    
			    long result = 0L;
			    for(Long eachNumber :numbers){                 
			    	sum =sum +eachNumber ;       
			    	result = sum+= initial;             
			    }
			    System.out.println(result);  
			    
			    //stream generate 200 
			    // parallel stream
			    //peek current thread
			    //reduce (10,Integer::sum)
			    //print total
			    
			    //10 is only added to 32 times at max 
			    // after that adding its not added
			    //why because of parallel stream
			    
			    
				Stream<Integer> ints = Stream.of(0, 0, 0, 0);
				int sum2 = ints.reduce(10, (a, b) -> a + b,(a,b)->a+b);
				System.out.println("sum = " + sum2);

				

			    
	}
				
	      

}
