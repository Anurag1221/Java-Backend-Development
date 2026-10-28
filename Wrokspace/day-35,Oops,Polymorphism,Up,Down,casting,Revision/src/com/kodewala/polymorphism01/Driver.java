package com.kodewala.polymorphism01;

public class Driver {

	public static void main(String[] args) {
		
		DeliveryProcessor deliveryProcessor = new DeliveryProcessor();
		
		deliveryProcessor.processDelivery(new ExpressBee());

	}

}
