package com.kodewala.Oops.Encapsulation;

public class Order {
	
	//throw private variable ,class is well encapsulated
	private int orderAmount;
	
	
	public Order(int orderAmount) {
		super();
		this.orderAmount = orderAmount;
	}
	
	//set the amount 
	public void setAmount(int amount) {

		orderAmount = orderAmount + amount;
	}
	
	//return the amount 
	public int getAmount() {

		return orderAmount;
	}
}
