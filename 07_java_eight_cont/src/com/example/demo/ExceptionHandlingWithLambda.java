package com.example.demo;

import java.util.List;
import java.util.concurrent.RecursiveTask;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;





public class ExceptionHandlingWithLambda {

	
	
	public static Consumer<Integer> wrapper(Consumer<Integer> consumer){
		
		
		Consumer<Integer> cons = (consRef) ->{
		
			try {
				consumer.accept(consRef);
				
			} catch (Exception e) {
				
				System.err.println("Denominator should not be ZERO");
				System.err.println(e.getClass());
			}
		};
		
		return cons;
	}
	
	
	public void  handleException() {
		
		
		List<Integer> limarks =List.of(49,56,24,89,0);
		
		
		

//		Function<Integer, Integer> division = (number) -> {
//			
//			
//			int result =0;
//			
//			try {
//				result= 420/number;
//			} catch (Exception e) {
//			
//				System.err.println("Denominator should not be zero");
//			}
//			return result;
//		};
//		

		limarks.forEach( wrapper(e ->System.out.println(420/e)));
		
		
		
		Function<String,Integer> parser = (argOne) -> Integer.parseInt(argOne);
		
		
		parser.apply("Four");
		
		
//		Consumer<Integer> another = () ->{
//			
//			parser.apply("Four");
//		};
//		
		
	}
	
	
	public static void main(String[] args) {
		
		
		ExceptionHandlingWithLambda obj = new ExceptionHandlingWithLambda();
		
		
		//obj.handleException();
		
		IntStream stream = IntStream.of(89,56,45,23,90);
		
		
//		stream.filter(e -> e>30)
//				 .peek(e -> System.out.println("First Peep"+e))
//				  .map(e -> e * 2)
//		          .peek((e) ->System.out.println("Second Peep"+e))
//		            .forEach(System.out::println);
//		
		
		//stream.limit(3).forEach(System.out::println);
		
		System.out.println("After Skipping");
		
		stream.skip(3).forEach(System.out::println);
		
	}
	
}
