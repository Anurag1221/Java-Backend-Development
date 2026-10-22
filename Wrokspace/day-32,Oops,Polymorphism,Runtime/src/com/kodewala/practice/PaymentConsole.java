package com.kodewala.practice;

class DigitalPaymentProcessor {

	public void processPayment(double amount) {

		System.out.println("Processing digital payment...");
	}
}

class UPIPaymentProcessor extends DigitalPaymentProcessor {

	@Override
	public void processPayment(double amount) {

		System.out.println("Processing UPI payment of Rs. " + amount);
		System.out.println("Verifying UPI transaction...");
		System.out.println("UPI payment successful.");
	}

}

class CardPaymentProcessor extends UPIPaymentProcessor {

		@Override
		public void processPayment(double amount) {

			System.out.println("Processing card payment of Rs. " + amount);
			System.out.println("Verifying card details...");
			System.out.println("Card payment successful.");

	}
}

public class PaymentConsole {

	public static void main(String[] args) {
		
		DigitalPaymentProcessor processor;
		
		//up-casting
		//parent class referring the child class object
//		processor = new UPIPaymentProcessor();
//		processor.processPayment(1000);
		
		//up-casting
		//parent class referring the child class object
		processor = new CardPaymentProcessor();
		processor.processPayment(0);
	}
}

//Q2. Digital Payment Processing
//Basic
//Classes: DigitalPaymentProcessor, UPIPaymentProcessor, CardPaymentProcessor, PaymentConsole
//
//An online shopping application supports UPI and card payments. Each payment method has its own processing steps.
//
//Requirements
//1. Create processPayment(double amount) in the parent class.
//2. Override the method in both child classes.
//3. Create a DigitalPaymentProcessor reference for a UPI payment object.
//4. Call the overridden method.
//5. Repeat for a card payment object.
//New concept: Calling different payment implementations through a common parent type.
