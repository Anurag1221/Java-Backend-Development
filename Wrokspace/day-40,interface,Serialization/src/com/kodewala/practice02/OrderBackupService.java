package com.kodewala.practice02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OrderBackupService {
	
	public void processDelivery(DeliveryOrder deliveryOrder) throws IOException {
		
		FileOutputStream fileOutputStream = new FileOutputStream("deliveryOrder.ser"); //create file
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream); //convert object into byte stream
		
		objectOutputStream.writeObject(deliveryOrder);
		
		objectOutputStream.close();
	}
}
