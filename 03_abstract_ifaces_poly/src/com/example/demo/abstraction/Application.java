package com.example.demo.abstraction;

import java.time.LocalDate;

import com.example.demo.ifaces.Function;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// supertype = subtype  is always valid
		
		Insurance insObj = new LifeInsurance(1010,"Ramesh",90000, LocalDate.now());
		
		// calling the overridden method using super class reference 
		// at run time it will call the lifeinsurance calculate premium
		
		System.out.println(insObj.calculatePremium());
		
		
		// subtype = subtype
		
		LifeInsurance lifeObj = new LifeInsurance(1012,"Ramesh",20000, LocalDate.now());
		
		// calling the method is which not overriden in the sub class
		System.out.println(lifeObj.nonAbstract());
		
		
		
		
		Insurance insObj2 = new LifeInsurance(1020,"Rajesh",190000, LocalDate.now());

		
		//System.out.println(insObj2.sayHello());  // object reference is super type so cannot call the sub class method
		
		((LifeInsurance)insObj2).sayHello();    // down casting to sub type and call the required method
		
		
		Number first = Integer.valueOf(20);
		
		
		//Boolean isThisAllowed =first;  //someClass = someUnrelatedClass
		
		//Boolean isThisAllowed =(Boolean)first;  //somcClass = (someClass)someUnrelatedClass

		
		//Double second = (Double)first;   //subclass=(subclass)superclass checks and throws class cast exception at runtime

		
		//System.out.println(second);
		
		
		
		Function currencyConverter = new UsdToInrConverter();
		
		print(currencyConverter,100);
		
		Function farenToCel = new FarenToCel();
		
		print(farenToCel, 92);
	}

	public static void print(Function func,double value) {
		
		if(func instanceof UsdToInrConverter) {
			
			System.out.println("USD to INR"+func.apply(value));
		} else {
			
			System.out.println("CEL To Faren"+func.apply(value));
		}
	}
}
