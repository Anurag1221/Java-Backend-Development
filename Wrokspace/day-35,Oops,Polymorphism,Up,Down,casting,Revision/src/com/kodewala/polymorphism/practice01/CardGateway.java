package com.kodewala.polymorphism.practice01;

public class CardGateway extends PaymentGateway{
	
	@Override
	public void processPayment(double amount) {
		
		System.out.println("CardGateway.processPayment() :" + amount);
	}

}
