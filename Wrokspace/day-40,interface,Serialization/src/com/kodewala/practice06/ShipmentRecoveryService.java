package com.kodewala.practice06;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ShipmentRecoveryService {
	
	public void readFile() throws IOException, ClassNotFoundException {
		
		FileInputStream fileInputStream = new FileInputStream("record.ser");
		
		ObjectInputStream inputStream = new  ObjectInputStream(fileInputStream);
		
		ShipmentRecord record = (ShipmentRecord) inputStream.readObject();
		
//		System.out.println("shipmentID; " + record.shipmentID);
//		System.out.println("warehouseName; " + record.warehouseName);
//		System.out.println("destinationCity; " + record.destinationCity);
//		System.out.println("shipmentWeight; " + record.shipmentWeight);
		
		inputStream.close();
	}
}
