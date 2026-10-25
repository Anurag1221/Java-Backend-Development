package com.kodewala.polymorphism.practice01;

public class BikeDispatch extends DeliveryMode{
	
	@Override
	public void calculateDeliveryTime(int distanceKm) {

		System.out.println("BikeDispatch.calculateDeliveryTime() :" +distanceKm);
	}
}
