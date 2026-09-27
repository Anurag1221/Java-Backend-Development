package com.kodewala.constructor2;

public class NotificationServiceDriver {

	public static void main(String[] args) {
		
		NotificationService noti = new NotificationService();
		
		noti.sendNotification("sms");
		noti.sendNotification("email");
		noti.sendNotification("other");

	}

}
