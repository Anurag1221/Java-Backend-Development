package com.kodewala.polymorphism.runtime;

public class Client {

	public static void main(String[] args) {
		
		PaymentProcessor paymentProcessor = new PaymentProcessor();
		
		//for the user#1, he/she selected payment method as a debit card
//		DebitCardPayment debitCardPayment = new DebitCardPayment();
//		paymentProcessor.processPayment(debitCardPayment);
		
		//for the user#2, he/she selected payment method as a credit card
//		CreditCardPayment creditCardPayment = new CreditCardPayment();
//		paymentProcessor.processPayment(creditCardPayment);
		
		//for the user#3, he/she selected payment method as a upi payment
		UPIPayment payment = new UPIPayment();
		paymentProcessor.processPayment(payment);
		

	}

}
