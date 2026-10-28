package com.kodewala.Oops.abstraction;

public class Account {
	
	public void credit() {
			
		//check the balance of sender
		checkBalance();
		//check the pin of sender
		validatePin("4536");
		//debit the amount
		//credit the amount
		System.out.println("Account.credit().....doing fund transfer");
	}
	
	private int checkBalance() {
		
		System.out.println("Account.checkBalance()");
		return 2000;
	}
	
	private boolean validatePin(String userId) {
		
		System.out.println("Account.validatePin()");
		return true;
	}
}
