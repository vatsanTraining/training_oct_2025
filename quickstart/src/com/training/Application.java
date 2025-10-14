package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Greeting greet = new Greeting();
		
		String value = greet.getMessage();
		
		String copy = value.substring(2);
		
		System.out.println(copy);
		
		//System.out.println(greet.show());
		
		System.out.println(greet.getMessage("Ramesh"));

		System.out.println(greet.getMessage(args[1]));

		
		Student ram = new Student();
		
		 ram.setFirstName("Rama");
		 ram.setLastName("Krish");
		 ram.setMarkScored(50);
		 
		 Address addr = new Address();
		 
		 addr.setAddressLine2("Gandhi Street");
		 addr.setAddrssLine1("Nehur Nagar");
		 addr.setCity("Indarpur");
		 addr.setPincode(5601002);
		 
		 ram.setAddress(addr);
		 
		 System.out.println(ram.toString());
		 
		 
		 StudentService service = new StudentService();
		 
		 System.out.println("Grade:=>"+service.assignGrade(ram));
		 
	}

}
