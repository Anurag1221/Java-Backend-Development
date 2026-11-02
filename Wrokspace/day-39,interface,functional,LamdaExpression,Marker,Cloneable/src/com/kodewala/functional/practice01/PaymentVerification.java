package com.kodewala.functional.practice01;

//functional interface
public interface PaymentVerification {
	
	//abstract method
	boolean verifyTransaction(String transactionId, double amount);
	
	//default method
	default void displayVerificationMessage(){
		
	 System.out.println("Verifying UPI transaction...");
	}
}
