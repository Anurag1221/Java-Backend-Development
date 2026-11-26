package com.kodewala.collection.practice50;

import java.util.ArrayList;

public class WarehouseShipmentScheduler {

	public static void main(String[] args) {

		// Create an ArrayList to store shipment IDs
		ArrayList<String> shipmentIds = new ArrayList<>();

		// Add 10 shipment IDs
		shipmentIds.add("SHP101");
		shipmentIds.add("SHP102");
		shipmentIds.add("SHP103");
		shipmentIds.add("SHP104");
		shipmentIds.add("SHP105");
		shipmentIds.add("SHP106");
		shipmentIds.add("SHP107");
		shipmentIds.add("SHP108");
		shipmentIds.add("SHP109");
		shipmentIds.add("SHP110");

		shipmentIds.add(2, "SHP102.5"); // TL - O(n)
		shipmentIds.remove(4); // TL - O(n)
		shipmentIds.add(5, "SHP105.5");// //TL - O(n)
		shipmentIds.remove(3);// //TL - O(n)
		shipmentIds.add(shipmentIds.size(), "SHP111"); // TL - O(1)
		shipmentIds.add(shipmentIds.size(), "SHP112"); // TL - O(1)

		System.out.println(shipmentIds);
	}

}
