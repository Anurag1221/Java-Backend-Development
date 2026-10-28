package com.kodewala.polymorphism.practice02;

public class Client {

	public static void main(String[] args) {

		AlertDispatcher alertDispatcher = new AlertDispatcher();
		
//		//Up-casting
//		// Parent reference pointing to a LoginAlert object
//		LoginAlert alert = new LoginAlert();
//		alertDispatcher.processAlerlt(alert);

		// Downcast to access transaction-specific details.
		 SecurityAlert alert2 = new TransactionAlert();
		 
		TransactionAlert transaction = (TransactionAlert) alert2;
		transaction.sendAlert();
		
		
	}
}
