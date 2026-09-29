package com.kodewla.control.practice;

public class DeliveryEligibilityDriver {

	public static void main(String[] args) {
		
		DeliveryEligibility deli = new DeliveryEligibility();
		
		deli.delivery(999, 6);
	}

}

//1. E-Commerce Delivery Eligibility
//Create a class DeliveryEligibility.
//
//Take:
//
//orderAmount
//deliveryDistance
//
//Rules:
//
//Order amount >= ₹999 → Free delivery
//Otherwise, if distance <= 5 km → ₹40 delivery charge
//Otherwise → ₹80 delivery charge
//
//Print the final delivery charge.
//
//Focus: if-else
