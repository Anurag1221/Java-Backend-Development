package com.kodewala.exceptionHanding01;

public class ShipmentTrackingService {

	public void processTracking() {

		String[] deliveryCheckpoints = { "Order Confirmed", "Package Dispatched", "Out for Delivery", "Delivered" };

		try {
			String checkpointIndex = deliveryCheckpoints[2];
			System.out.println("Delivery Checkpoints: " + checkpointIndex.length());
		} 
		catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Invalid index find,This index not available");
			e.printStackTrace();
		}

		System.out.println("Tracking request completed");

	}

	public static void main(String[] args) {

		ShipmentTrackingService service = new ShipmentTrackingService();
		service.processTracking();
	}

}

//1. E-Commerce – Order Tracking System
//Concept: ArrayIndexOutOfBoundsException
//
//Scenario: An e-commerce company stores delivery checkpoints for an order. The customer wants to see a particular checkpoint.
//
//Classes:
//- ShipmentTrackingService
//- Driver
//Requirements:
//1. Declare a String[] containing 4 delivery checkpoints.
//2. Store the requested checkpoint index as int checkpointIndex = 5.
//3. Access the checkpoint inside try.
//4. Catch ArrayIndexOutOfBoundsException.
//5. Print a user-friendly message in catch.
//6. Print "Tracking request completed" after the catch block.
//New thing you will learn: How to handle invalid array indexes instead of crashing the program.
