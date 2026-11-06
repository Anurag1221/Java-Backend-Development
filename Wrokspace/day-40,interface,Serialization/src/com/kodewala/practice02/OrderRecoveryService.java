package com.kodewala.practice02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class OrderRecoveryService {
	
	public void readDelivery() throws IOException, ClassNotFoundException {
		
		FileInputStream fileInputStream = new FileInputStream("deliveryOrder.ser"); // read file
		
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);// convert byte stream to object
		
		DeliveryOrder deliveryOrder = (DeliveryOrder) inputStream.readObject();
		
		System.out.println("orderID; " + deliveryOrder.orderID);
		System.out.println("restaurantName; " + deliveryOrder.restaurantName);
		System.out.println("orderAmount; " + deliveryOrder.orderAmount);
		System.out.println("deliveryStatus; " + deliveryOrder.deliveryStatus);
		
		inputStream.close();
	}
}
