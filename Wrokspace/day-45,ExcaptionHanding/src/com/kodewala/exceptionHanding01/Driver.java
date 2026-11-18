package com.kodewala.exceptionHanding01;

public class Driver {
	
	public static void main(String[] args) {
		
		Account account = new Account();
		account.doActivate(null); 
		
	}
}

class Account{
	
	void doActivate(String accNo) {
		
		System.out.println("Account.doActivate() START");
		validateAccDetails(accNo);
		System.out.println("Account.doActivate() END");
	}
	
	private boolean validateAccDetails(String accNo) {
		
		System.out.println("Account.validateAccDetails() START");
		boolean isValid = accNo.startsWith("SBI");
		System.out.println("Account.validateAccDetails() END");
		
		return isValid;
	}
}