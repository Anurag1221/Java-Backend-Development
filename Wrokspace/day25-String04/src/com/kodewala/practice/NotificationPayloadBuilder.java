package com.kodewala.practice;

public class NotificationPayloadBuilder {

	public static void main(String[] args) {
		
		StringBuilder message = new StringBuilder("OTP: ");
		message.append(583921);
		
		 // 1. Print StringBuilder contents
		System.out.println(message);
		
		 // 2. Convert StringBuilder to String
		String convertedMessage = message.toString();
		
		// 3. Print the class name
		System.out.println(convertedMessage.getClass().getName());
		

	}

}
