package com.kodewala.exceptionHanding01;

public class ShipmentDataImportService {

	public static void main(String[] args) {
		
		ShipmentDataImportService dataImportService = new ShipmentDataImportService();
		dataImportService.processShipment();

	}
	
	public void processShipment() {
		
		String shipmentWeight = "45Gh";
		
		
		try {
			
			int shipmentWeightConv = Integer.parseInt(shipmentWeight);
			System.out.println("Shipment Weight" + shipmentWeight);
		}
		catch (NumberFormatException e) {
			
			System.out.println("Invalid shipment weight format");
			e.printStackTrace();
		}
		
		System.out.println("Shipment import process completed");
	}

}
