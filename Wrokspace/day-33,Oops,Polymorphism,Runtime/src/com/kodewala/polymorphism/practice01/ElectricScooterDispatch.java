package com.kodewala.polymorphism.practice01;

public class ElectricScooterDispatch extends DeliveryMode{

	@Override
	public void calculateDeliveryTime(int distanceKm) {

		System.out.println("ElectricScooterDispatch.calculateDeliveryTime() :" + distanceKm);
	}

}
