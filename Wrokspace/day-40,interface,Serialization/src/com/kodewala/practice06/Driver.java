package com.kodewala.practice06;

import java.io.IOException;

public class Driver {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ShipmentRecord record1 = new ShipmentRecord("SH101", "DelhiHub", "Jaipur", 25);
		ShipmentRecord record2 = new ShipmentRecord("SH102", "MumbaiHub", "Bhopal", 40);
		ShipmentRecord record3 = new ShipmentRecord("SH103", "PuneHub", "Indore", 18);
		
		
		//serialization
		ShipmentArchiveService archiveService = new ShipmentArchiveService();
		archiveService.createFile(record1);
		
		ShipmentArchiveService archiveService1 = new ShipmentArchiveService();
		archiveService.createFile(record2);
		
		ShipmentArchiveService archiveService2 = new ShipmentArchiveService();
		archiveService.createFile(record3);
		
		//de-serialization
		ShipmentRecoveryService recoveryService = new ShipmentRecoveryService();
		recoveryService.readFile();
		
		System.out.println("shipmentID; " + record1.shipmentID);
		System.out.println("warehouseName; " + record1.warehouseName);
		System.out.println("destinationCity; " + record1.destinationCity);
		System.out.println("\n shipmentWeight; " + record1.shipmentWeight);
		
		System.out.println("shipmentID; " + record2.shipmentID);
		System.out.println("warehouseName; " + record2.warehouseName);
		System.out.println("destinationCity; " + record2.destinationCity);
		System.out.println("\nshipmentWeight; " + record2.shipmentWeight);
		
		System.out.println("shipmentID; " + record3.shipmentID);
		System.out.println("warehouseName; " + record3.warehouseName);
		System.out.println("destinationCity; " + record3.destinationCity);
		System.out.println("shipmentWeight; " + record3.shipmentWeight);
		
		
	}
}
