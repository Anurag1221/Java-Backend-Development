package com.kodewala.practice01;

public class Driver {
	
	public static void main(String[] args) {
		
		BankAccountVerificationEngine accountVerificationEngine = new BankAccountVerificationEngine();
		accountVerificationEngine.activateCustomerAccount("SBI7665543436");
	}
}
