package com.kodewala.collection.practice;

import java.util.ArrayList;

public class DeliveryRouteManager {

	public static void main(String[] args) {

		ArrayList<String> delivery = new ArrayList();
		delivery.add("Indore");
		delivery.add("Bhopal");
		delivery.add("Nagpur");
		delivery.add("Pune");
		delivery.add("Mumbai");

		// insert Ujjain at index 1
		delivery.add(1, "Ujjain");
		System.out.println(delivery);

		// remove Nagpur
		delivery.remove("Nagpur");
		System.out.println(delivery);

		//add mumbai into index 0
		int index = delivery.indexOf("Mumbai");

		String location = delivery.remove(index);

		delivery.add(0, location);
		
		System.out.println(delivery);

	}

}
