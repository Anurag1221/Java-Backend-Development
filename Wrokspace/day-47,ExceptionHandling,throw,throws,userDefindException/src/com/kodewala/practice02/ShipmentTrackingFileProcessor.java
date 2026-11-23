package com.kodewala.practice02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ShipmentTrackingFileProcessor {

	public void shipmentTrackingFileProcessor(String trackingFile) throws IOException {

		FileReader fr = new FileReader(trackingFile);
		BufferedReader br = new BufferedReader(fr);

		String line;

		while ((line = br.readLine()) != null) {
			
			//throw new IOException("Tracking File Data: " + line);
			System.out.println("Tracking File Data: " + line);
		}
		br.close();
	}

	public void validateShipmentRecord(String shipmentId, String shipmentStatus) {

		try {
			readShipmentFile(shipmentStatus, shipmentId);
		} 
		catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Shipment processing completed");
		}

	}

	public void readShipmentFile(String shipmentId, String shipmentStatus) throws IllegalArgumentException {

		if (!shipmentId.startsWith("SHIP")) {
			throw new IllegalArgumentException("Invalid shipment ID");
		}

		if (!shipmentStatus.equals("PICKED_UP") && !shipmentStatus.equals("IN_TRANSIT")
				&& !shipmentStatus.equals("DELIVERED")) {

			throw new IllegalArgumentException("Invalid shipment status");
		}

		System.out.println("Shipment ID validation successful");
		
		System.out.println("Shipment ID validation successful");

	}
}
