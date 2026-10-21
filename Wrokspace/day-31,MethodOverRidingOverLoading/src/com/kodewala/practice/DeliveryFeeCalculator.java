package com.kodewala.practice;
//method overloading
public class DeliveryFeeCalculator {

	public void calculateFee(double distance) {

		double fee = distance * 10;

		System.out.println("Delivery Distance: " + distance + " km");
		System.out.println("Delivery Fee: ₹" + fee);
	}

	public void calculateFee(double distance, boolean expressDelivery) {

		double fee = distance * 10;

		if (expressDelivery) {
			fee = fee + 30;
		}

		System.out.println("Delivery Distance: " + distance + " km");
		System.out.println("Express Delivery: " + expressDelivery);
		System.out.println("Delivery Fee: ₹" + fee);
	}

	public void calculateFee(double distance, int orderValue) {

		double fee = distance * 10;

		if (orderValue >= 500) {
			fee = 0;
		}

		System.out.println("Delivery Distance: " + distance + " km");
		System.out.println("Order Value: ₹" + orderValue);
		System.out.println("Delivery Fee: ₹" + fee);
	}

}

//Q3 · Basic · Overloading
//Online Food Delivery Charges
//
//Class: DeliveryFeeCalculator
//
//A food delivery platform calculates delivery charges using different inputs.
//
//Requirements:
//1. Create calculateFee(double distance).
//2. Overload it with calculateFee(double distance, boolean expressDelivery).
//3. Overload it with calculateFee(double distance, int orderValue).
//4. Print the selected delivery details in each method.
//5. Call all three methods with suitable values.
//New concept: Overloading methods for different business requirements.
