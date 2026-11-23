package com.kodewala.execptionHandling.practice;

public class ShipmentTrackingProcessor {

	public void processTracking() {

		// Create String array of size 4
		String[] trackingIds = new String[4];

		// Store four tracking IDs
		trackingIds[0] = "SHIP101";
		trackingIds[1] = "SHIP102";
		trackingIds[2] = "SHIP103";
		trackingIds[3] = "SHIP104";

		try {
			// Access invalid index
			System.out.println("Tracking ID: " + trackingIds[3]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Invalid tracking record position");

			e.printStackTrace();
		}

		// Access valid index
		System.out.println("Valid Tracking ID: " + trackingIds[2]);

	}
}

//4. Logistics – Shipment Tracking
//Scenario: A logistics application stores multiple shipment tracking IDs in an array.
//
//Classes:
//- ShipmentTrackingProcessor
//- Driver
//Requirements:
//1. Create a String array of size 4.
//2. Store four tracking IDs.
//3. Try to access the element at index 5.
//4. Handle ArrayIndexOutOfBoundsException.
//5. Print "Invalid tracking record position".
//6. Access index 2 successfully.
//New learning: ArrayIndexOutOfBoundsException.
