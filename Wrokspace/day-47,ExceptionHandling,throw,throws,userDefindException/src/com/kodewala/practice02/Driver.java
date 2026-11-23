package com.kodewala.practice02;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) {
		
		ShipmentTrackingFileProcessor fileProcessor = new ShipmentTrackingFileProcessor();
		String ship = "src/com/kodewala/practice02/shipment-tracking-backup.txt";
		
		try {
			fileProcessor.shipmentTrackingFileProcessor(ship);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		fileProcessor.readShipmentFile("SHIP202611", "DELIVERED");

	}

}
