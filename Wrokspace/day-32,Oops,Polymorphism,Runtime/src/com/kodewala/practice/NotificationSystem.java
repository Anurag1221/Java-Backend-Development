package com.kodewala.practice;

class Notification {

	public void send() {
		
		System.out.println("Notification.send()");
	}
}

class EmailNotification extends Notification {
	
	@Override
	public void send() {
		
		System.out.println("EmailNotification.send()");
	}
}

class SMSNotification extends EmailNotification {

	@Override
	public void send() {
		
		System.out.println("SMSNotification.send()");
	}
}

public class NotificationSystem {

	public static void main(String[] args) {
		
		Notification noti;

		//parent class(Notification) referring the child class object(EmailNotification), up-casting
//		noti = new EmailNotification(); 
//		noti.send();
		
		//parent class(Notification) referring the child class object(SMSNotification), up-casting
//		noti = new SMSNotification();
//		noti.send();
		
		//down-caasting - currently i am getting error
		EmailNotification email = (EmailNotification) new Notification();//child class(EmailNotification) referring the parent class object(Notification)
		email.send();
		

	}

}

//Design a Notification system where a parent class Notification has a send() method,
//overridden by EmailNotification and SMSNotification, executing based on the actual object at
//runtime.
