package com.kodewala.practice;

// Method OverRiding
class PaymentNotificationService {

	public void sendNotification() {

		System.out.println("PaymentNotificationService.sendNotification()");
	}
}

public class UPIPaymentNotificationService extends PaymentNotificationService {

	@Override
	public void sendNotification() {

		System.out.println("PaymentNotificationService.sendNotification()");
		System.out.println("UPIPaymentNotificationService.sendNotification()");
	}
}

//Q2 · Basic · Overriding
//Digital Payment Notifications
//
//Classes: PaymentNotificationService, UPIPaymentNotificationService
//
//A payment platform sends notifications after a transaction. UPI payments require a specific notification message.
//
//Requirements:
//1. Create sendNotification() in the parent class.
//2. Print a general payment notification.
//3. Extend the parent class in UPIPaymentNotificationService.
//4. Override sendNotification() with a UPI-specific message.
//5. Create an object of the child class and call the method.
//New concept: A child class provides its own version of an inherited method.