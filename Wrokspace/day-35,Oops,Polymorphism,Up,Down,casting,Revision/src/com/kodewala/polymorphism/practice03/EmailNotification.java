package com.kodewala.polymorphism.practice03;

public class EmailNotification extends NotificationChannel{
	
	@Override
	public void sendNotification(String message) {

		System.out.println("EmailNotification.sendNotification()");
	}
}
