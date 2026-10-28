package com.kodewala.polymorphism.practice03;

public class WhatsAppNotification extends NotificationChannel {
	
	@Override
	public void sendNotification(String message) {

		System.out.println("WhatsAppNotification.sendNotification()");
	}

}
