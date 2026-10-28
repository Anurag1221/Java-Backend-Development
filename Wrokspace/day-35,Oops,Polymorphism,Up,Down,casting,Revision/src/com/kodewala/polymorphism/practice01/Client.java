package com.kodewala.polymorphism.practice01;

public class Client {

	public static void main(String[] args) {
		PaymentOrchestrator orchestrator = new PaymentOrchestrator();
		
		UPIGateway gateway = new UPIGateway();
		orchestrator.processPayment(gateway, 1599);
		
		CardGateway cardGateway = new CardGateway();
		orchestrator.processPayment(cardGateway, 1565);

	}

}
