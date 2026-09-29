package com.kodewla.control.practice;

public class OrderStatusTrackerDriver {

	public static void main(String[] args) {
		
		OrderStatusTracker order = new OrderStatusTracker();
		
		order.orderStatus(101);

	}

}

//3. Food Delivery Order Status
//Create a class OrderStatusTracker.
//
//Take an integer status code:
//
//1 → Order Received
//2 → Restaurant Accepted
//3 → Food Being Prepared
//4 → Out for Delivery
//5 → Delivered
//
//For any other number:
//
//Invalid Status
//
//Focus: switch
