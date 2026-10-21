package com.kodewala.oops.practice;

public class FoodDeliveryService {

	public void foodService() {
	
		confirmOrder();
		prepareFood();
		assignDeliveryPartner();
		startDelivery();
	}
	
	private boolean confirmOrder() {
		
		System.out.println("FoodDeliveryService.confirmOrder()");
		return true;
	}

	private boolean prepareFood() {
		
		System.out.println("FoodDeliveryService.prepareFood()");
		return true;
	}

	private boolean assignDeliveryPartner() {
		
		System.out.println("FoodDeliveryService.assignDeliveryPartner()");
		return true;
	}
	
	private boolean startDelivery() {
		
		System.out.println("FoodDeliveryService.startDelivery()");
		return true;
	}
}

//Q2. Food Delivery

//Class: FoodDeliveryService
//
//A food delivery application needs to confirm an order and arrange delivery.
//
//Requirements:
//1. Create confirmOrder().
//2. Create prepareFood().
//3. Create assignDeliveryPartner().
//4. Create startDelivery().
//5. Call the methods in the correct order.
//Learn: Breaking a real-world process into methods.
//
