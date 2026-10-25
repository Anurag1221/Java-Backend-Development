package com.kodewala.polymorphism.practice04;

public class ColdChainTracker extends ShipmentTracker{

	@Override
	public void trackShipment(String trackingId) {

		System.out.println("ColdChainTracker.trackShipment() :" + trackingId);
	}
}
