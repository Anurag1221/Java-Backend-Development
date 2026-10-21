package com.kodewala.oops.abstraction;

public class Order {

	public boolean placeOrder(String cusmoterName,String address, String itemName, String quantity) {

		orderDetails(cusmoterName, itemName);
		deliveryAddress(address);
		orderQuatity(quantity);
		orderID();
		orderValidation();
		orderPlaced();
		
		return true;
	}

	private boolean orderDetails(String cusmoterName, String itemName) {

		System.out.println("Order.OrderDetails()");
		return true;
	}
	
	private boolean deliveryAddress(String address) {

		System.out.println("Order.deliveryAddress()");
		return true;
	}

	private boolean orderQuatity(String quantity) {

		System.out.println("Order.orderQuatity()");
		return true;
	}

	private void orderID() {

		System.out.println("Order.orderID()");
	}

	private void orderValidation() {

		System.out.println("Order.orderValidation()");
	}

	private void orderPlaced() {

		System.out.println("Order.orderPlaced()");

	}
}
