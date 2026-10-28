package com.kodewala.Oops.Encapsulation;

public class Driver {

	public static void main(String[] args) {
		Order order = new Order(0);
		
		order.setAmount(299);
		
		System.out.println("Order Amount :" + order.getAmount());

	}

}
