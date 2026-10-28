package com.kodewala.polymorphism.practice03;

public class Client {
	
	public static void main(String[] args) {
		
		NotificationService notificationService = new NotificationService();
		
		//callint the WhatsAppNotification method
		WhatsAppNotification appNotification = new WhatsAppNotification();
		notificationService.sendUpdate(appNotification, "Hello");
	}
}
