package com.kodewala.polymorphism.practice01;

public class UPIGateway extends PaymentGateway{
	
	@Override
	public void processPayment(double amount) {
		
		System.out.println("UPIGateway.processPayment() :" + amount);
	}
}
