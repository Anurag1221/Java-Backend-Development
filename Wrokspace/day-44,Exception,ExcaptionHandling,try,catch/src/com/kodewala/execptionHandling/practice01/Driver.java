package com.kodewala.execptionHandling.practice01;

public class Driver {
	
	public static void main(String[] args) {
			
		PaymentGatewayProcessor gatewayProcessor = new PaymentGatewayProcessor();
		gatewayProcessor.processPayment("twenty thousand", 5);
	}
	
}
