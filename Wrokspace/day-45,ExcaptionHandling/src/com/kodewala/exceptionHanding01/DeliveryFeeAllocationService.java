package com.kodewala.exceptionHanding01;

public class DeliveryFeeAllocationService {

	public static void main(String[] args) {
		
		DeliveryFeeAllocationService allocationService = new DeliveryFeeAllocationService();
		allocationService.processDelivery();

	}
	
	public void processDelivery() {
		
		int totalDeliveryFee = 1200;
		int deliveryZones = 5;
		
		try {
			totalDeliveryFee = totalDeliveryFee / deliveryZones;
			System.out.println("Delivery Fee: " +totalDeliveryFee);
		}
		catch(ArithmeticException e){
			
			System.out.println("Divided by zero");
			e.printStackTrace();
		}
		
		System.out.println("Delivery zones cannot be zero");
	}

}

//2. Food Delivery – Delivery Fee Calculator
//Concept: ArithmeticException
//
//Scenario: A food delivery platform divides the delivery charge among multiple delivery zones. Sometimes, the number of zones is incorrectly set to zero.
//
//Classes:
//- DeliveryFeeAllocationService
//- Driver
//Requirements:
//1. Declare int totalDeliveryFee = 1200.
//2. Declare int deliveryZones = 0.
//3. Calculate totalDeliveryFee / deliveryZones inside try.
//4. Catch ArithmeticException.
//5. Print "Delivery zones cannot be zero".
//6. Print the final status outside the catch block.
//New thing you will learn: How to prevent division-by-zero failures in business logic.
