package com.kodewala.constructor2;

public class NotificationService {

	public void sendNotification(String _type) {

		System.out.println("NotificationService.sendNotificatio()");

		if (_type.equalsIgnoreCase("sms")) {
			SendSMS();
		} else if (_type.equalsIgnoreCase("email")) {
			SendEmail();
		} else {
			sendWhatsApp();
		}
	}

	private void SendSMS() {
		System.out.println("NotificationService.SendSMS() START");

		// biz logic

		System.out.println("NotificationService.SendSMS() END");

	}

	private void SendEmail() {
		System.out.println("NotificationService.SendSMS() START");

		// biz logic

		System.out.println("NotificationService.SendSMS() END");

	}

	private void sendWhatsApp() {
		System.out.println("NotificationService.SendSMS() START");

		// biz logic

		System.out.println("NotificationService.SendSMS() END");

	}

}
