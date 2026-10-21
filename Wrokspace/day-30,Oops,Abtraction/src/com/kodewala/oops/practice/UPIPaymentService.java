package com.kodewala.oops.practice;
//Abstraction
public class UPIPaymentService {
	
	// payment class is a common class using for call the all method.
	public void payment() 
	{
		verifyPayment();
		processPayment();
		showPaymentStatus();
	}
	
	//hiding to user, implementation, verify the payment
	private void verifyPayment() {

		System.out.println("UPIPaymentService.verifyPayment()");
	}
	
	//hiding to user, implementation, process payment
	private void processPayment() {

		System.out.println("UPIPaymentService.processPayment()");
	}
	
	//hiding to user, implementation, check payment status
	private void showPaymentStatus() {

		System.out.println("UPIPaymentService.showPaymentStatus()");
	}
	
}

//Q1. Digital Payment

//Class: UPIPaymentService
//
//An online shopping application needs to process a payment.
//
//Requirements:
//1. Create a method verifyPayment().
//2. Create a method processPayment().
//3. Create a method showPaymentStatus().
//4. Call these methods from the main() method.
//Learn: Hiding internal steps inside methods.
//
