package com.kodewala.polymorphism.practice01;

public class PaymentOrchestrator {

	public void processPayment(PaymentGateway paymentgateway, double amount) {
		
		paymentgateway.processPayment(amount);
	}

}
