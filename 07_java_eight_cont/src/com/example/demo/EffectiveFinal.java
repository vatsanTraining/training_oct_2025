package com.example.demo;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class EffectiveFinal {

	
	public void learnEffectiveFinal() {
		
		 int mark = 90;
		
		Predicate<Integer> checkMark =(actual) -> {
		
			//mark+=10;   // effectively final
			return actual >90;
		};
	
		
		Consumer<String> consumer = (e) -> 
			 { System.out.println(e);
			  System.out.println("this referers to:=>"+this.getClass().getName());
			 } ;
		
		
		consumer.accept("Use of this");
	}
	
	public static void learnThisInStaticContext() {
		
		
		
		Consumer<String> consumer = (e) -> {
			System.out.println(e);
			// System.out.println("this referers to:=>"+this.getClass().getName());
		};
		
		
		consumer.accept("Use of this");
	}
	
	public static void main(String[] args) {
		
		EffectiveFinal obj = new EffectiveFinal();
		
		obj.learnEffectiveFinal();
		
		IntPredicate primitVer = (number) -> number % 2 == 0;
		
		System.out.println("is Even =>"+ primitVer.test(12));
				
		
		Function<String,String> firstSix =  (arg) -> arg.substring(0,6);

		Function<String,String> lastThree =  (arg) -> arg.substring(arg.length()-3);

		Function<String,String> another =  (arg) -> arg.toUpperCase();

		
	 System.out.println("And Then:=>Expect:=> Lambda becomes  bda :actual:=> " +firstSix.andThen(lastThree).apply("LambdaExpression"));
		

	 System.out.println("Compose Expect :=>LAMBDA :=>ACTUAL " +firstSix.compose(another).apply("LambdaExpression"));

		
	 
     Function<String, String> first = (arg) ->arg.substring(0,4);
     Function<String, String> second = (arg) -> arg.substring(0,6);

     System.out.println(first.compose(second).apply("LambdaExpression"));  

     
	}
	

}
