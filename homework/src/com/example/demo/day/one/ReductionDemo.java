package com.example.demo.day.one;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ReductionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Example: Summing a list of amounts
		
		List<Double> amounts = Arrays.asList(5.0, 15.0, 20.0);

		// identity is 0.0 (the neutral element for addition)
		double sum = amounts.stream()
		    .reduce(0.0,
		            (currentSum, amount) -> currentSum + amount, // Accumulator (summing)
		            Double::sum);                                 // Combiner (merging subtotals)

		// Result: 5.0 + 15.0 + 20.0 = 40.0

		//Example If the stream is empty, the result will be the identity value (0.0 in this case).
		
		List<Double> list = new ArrayList<>();
		
		double total = list.parallelStream().reduce(0.0,
		                                    (currentSum, amount) -> currentSum + amount,
		                                    Double::sum);
		// Result: 0.0 (returns the identity)
		System.out.println("Sum: " + sum);
		
		
		
		// Simulating invoices with getAmount() method
		class Invoice {
		    private double amount;
		    public Invoice(double a) { this.amount = a; }
		    public double getAmount() { return amount; }
		}

		List<Invoice> invoices = Arrays.asList(new Invoice(50.0), new Invoice(30.0));

		// Identity is 10.0 (a fixed initial fee/starting balance)
		
		double initalBalance = 10.0;
		
		double totalAmount = invoices.stream()
		    .reduce(initalBalance, // Start with a 10.0 
		            (tot, inv) -> tot + inv.getAmount(), // Accumulator
		            Double::sum);                        // Combiner

		System.out.println("Total Amount: " + totalAmount);
		// Calculation: 10.0 (identity) + 50.0 + 30.0 = 90.0
		
		//total=identity+(sum of all elements)
		
		//Finding the Product of a Stream (Correct Identity: 1)
		//When multiplying numbers, the identity must be 1 because multiplying any number by 1 does not change its value (1×u=u).

		List<Integer> numbers = Arrays.asList(2, 3, 4);

		// identity is 1 (the neutral element for multiplication)
		int product = numbers.parallelStream()
		    .reduce(1,
		            (currentProduct, n) -> currentProduct * n, // Accumulator (multiplying)
		            (a, b) -> a * b);            
		
		// Combiner (merging subtotals)

		System.out.println("Product: " + product);
		// Result: 1 (identity) * 2 * 3 * 4 = 24


	}

}
