package com.kodewala.collection.practice51;

import java.util.ArrayList;

public class OrderCancellationProcessor {

	public static void main(String[] args) {

		// Create an ArrayList to store order IDs
		ArrayList<String> orderIds = new ArrayList<>();

		// Add 6 order IDs
		orderIds.add("ORD101");
		orderIds.add("ORD102");
		orderIds.add("ORD103");
		orderIds.add("ORD104");
		orderIds.add("ORD105");
		orderIds.add("ORD106");
		
		
		orderIds.remove(5); // TL - O(1)
		orderIds.remove(2); // TL - O(n)
		
		System.out.println(orderIds);
		
		
	}

}
