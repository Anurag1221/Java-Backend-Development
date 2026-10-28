package com.kodewala.practice;

public class DeliveryDriver  {

	public static void main(String[] args) {

		// Create a medicine shipment requiring temperature control.
		RefrigeratedShipment medicine = new RefrigeratedShipment("EXP202", "Mumbai", "High");

		// Create an express shipment requiring faster delivery.
		ExpressShipment express = new ExpressShipment("EXP202", "Mumbai", 101);

		// Display refrigerated shipment details.
		System.out.println("Refrigerated Shipment");
		medicine.displayDetails();

		System.out.println();

		// Display express shipment details.
		System.out.println("Express Shipment");
		express.displayDetails();
	}
}
