package com.kodewala.polymorphism.practice04;

public class TrackingService {
	
	public void service(ShipmentTracker shipmenttracker, String trackingId) {
		
		shipmenttracker.trackShipment(trackingId);
	}
	
}
