package com.example.demo.day.one;

public class BankAccount {

	private long  accountNumber;
	private String accountHolderName;
	private double balance;
	
	private BankAccount() {
		
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getBalance() {
		return balance;
	}
	
	
	
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", balance="
				+ balance + "]";
	}



	public static class Builder{
		
		private long  accountNumber;
		private String accountHolderName;
		private double balance;
		
		// if any mandatory attribute, add in constructor
		
		public Builder accountNumber(long accountNumber) {
			this.accountNumber = accountNumber;
			return this;
		}
		
		public Builder accountHolderName(String accountHolderName) {
			this.accountHolderName = accountHolderName;
			return this;
		}
		
		public Builder balance(double balance) {
			this.balance = balance;
			return this;
		}
		
		public BankAccount build() {
			BankAccount bankAccount = new BankAccount();
			bankAccount.accountNumber = this.accountNumber;
			bankAccount.accountHolderName = this.accountHolderName;
			bankAccount.balance = this.balance;
			return bankAccount;
		}
	}

		

	}
	

