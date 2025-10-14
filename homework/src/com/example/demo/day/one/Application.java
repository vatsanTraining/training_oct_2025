package com.example.demo.day.one;

public class Application {

	public static void main(String[] args) {

		
		BankAccount bankAccount1 = new BankAccount.Builder()
				.accountNumber(89292399)
				.accountHolderName("Ramesh")
				.balance(54000.00)
				.build();

	
		
	
		BankAccount bankAccount2 = new BankAccount.Builder()
				.accountNumber(89292398)
				.accountHolderName("Suresh")
				.balance(64000.00)
				.build();
		
		BankAccount bankAccount3 = new BankAccount.Builder()	
				.accountNumber(89292397)
				.accountHolderName("Mahesh")
				.balance(74000.00)
				.build();
		
		
		 BankAccountService service = new BankAccountService();
		 
		 service.addBankAccount(bankAccount1);
		 service.addBankAccount(bankAccount2);
		 service.addBankAccount(bankAccount3);
		 
		 
		 
		 
		 for(BankAccount eachAccount : service.findTopN(2)) {
			 System.out.println(eachAccount);
		 }
		}
	
	

}
