package com.kodewala.shallo_deep_copy.practice01;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {

		DeliveryLocation deliveryLocation = new DeliveryLocation("LJ84", "Near by petrol pump", "Lanji");

//		DeliveryLocation deliveryLocation1 = (DeliveryLocation) deliveryLocation.clone();
//		
//		deliveryLocation.city = "Bagalore";
//		
//		System.out.println(deliveryLocation.city);
//		System.out.println(deliveryLocation1.city);

		ShipmentOrder order = new ShipmentOrder("OR101", "Anurag", deliveryLocation);

		ShipmentOrder order1 = (ShipmentOrder) order.clone();

		order.deliveryLocation.city = "Bangalore";

		System.out.println(order.deliveryLocation.city);
		System.out.println(order1.deliveryLocation.city);

	}

}
