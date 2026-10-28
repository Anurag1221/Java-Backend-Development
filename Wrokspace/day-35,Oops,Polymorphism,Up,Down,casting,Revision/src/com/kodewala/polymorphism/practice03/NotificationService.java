package com.kodewala.polymorphism.practice03;

public class NotificationService {
	
	public void sendUpdate(NotificationChannel channel, String message) {
		
		channel.sendNotification(message);
	}
}
