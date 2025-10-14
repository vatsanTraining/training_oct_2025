package com.example.demo.day.one;

import java.util.Arrays;

public class BankAccountService {

	
	private BankAccount[] bankAccounts;
	
	private int i = 0;
	public BankAccountService() {
		this.bankAccounts = new BankAccount[3];
	}		

	public void addBankAccount(BankAccount account) {
				bankAccounts[i] = account;

				i++;
		
	}	
	
	public BankAccount[] findTopN(int k) {
		
		Arrays.sort(bankAccounts, (a, b) -> Double.compare(b.getBalance(), a.getBalance()));
		


		    return Arrays.copyOf(bankAccounts, k);
		
		
		
	}
}
