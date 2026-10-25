package com.kodewala.polymorphism.practice01;

public class DispatchCoordinator{
	
	public void coordinator(DeliveryMode deliverymode,int distance) {
		
		deliverymode.calculateDeliveryTime(distance);
	}

}
