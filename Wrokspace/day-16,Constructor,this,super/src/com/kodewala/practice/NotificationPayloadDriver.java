package com.kodewala.practice;

public class NotificationPayloadDriver {

	public static void main(String[] args) {
		 // Recipient only
        NotificationPayload notification1 =
                new NotificationPayload("anurag@example.com");

        // Recipient + message
        NotificationPayload notification2 =
                new NotificationPayload(
                        "9876543210",
                        "Your OTP is 458921"
                );

        // Recipient + message + channel
        NotificationPayload notification3 =
                new NotificationPayload(
                        "user@example.com",
                        "Your payment was successful",
                        "EMAIL"
                );

        // All parameters
        NotificationPayload notification4 =
                new NotificationPayload(
                        "9876543210",
                        "Your order has been shipped",
                        "SMS",
                        "HIGH"
                );

        notification1.displayDetails();
        notification2.displayDetails();
        notification3.displayDetails();
        notification4.displayDetails();

	}

}
