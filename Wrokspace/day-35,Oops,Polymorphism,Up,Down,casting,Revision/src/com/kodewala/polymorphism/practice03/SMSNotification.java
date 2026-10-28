package com.kodewala.polymorphism.practice03;

public class SMSNotification extends NotificationChannel {
	
	@Override
	public void sendNotification(String message) {

		System.out.println("SMSNotification.sendNotification()");
	}

}
