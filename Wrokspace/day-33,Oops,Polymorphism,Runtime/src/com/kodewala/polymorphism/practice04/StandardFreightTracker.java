package com.kodewala.polymorphism.practice04;

public class StandardFreightTracker extends ShipmentTracker{
	
	@Override
	public void trackShipment(String trackingId) {

		System.out.println("StandardFreightTracker.trackShipment() :" + trackingId);
	}

}
