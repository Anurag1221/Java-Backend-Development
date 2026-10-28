package com.kodewala.polymorphism.practice03;

public class PushNotification extends NotificationChannel {
	
	@Override
	public void sendNotification(String message) {

		System.out.println("PushNotification.sendNotification()");
	}
	
	
}
