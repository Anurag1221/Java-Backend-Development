package com.kodewala.practice;

public class NotificationPayload {
	String recipient;
	String message;
	String channel;
	String priority;
	
	NotificationPayload(){
		this("Unknown");
	}
	
	NotificationPayload(String _recipient){
		this(_recipient, "Unknown");
	}
	
	NotificationPayload(String _recipient, String _message){
		this(_recipient, _message, "Unknown");
	}
	
	NotificationPayload(String _recipient, String _message, String _channel){
		this(_recipient, _message, _channel, "Unknown");
	}
	
	NotificationPayload(String _recipient, String _message, String _channel, String _priority){
		this.recipient = _recipient;
		this.message = _message;
		this.channel = _channel;
		this.priority = _priority;
	}
	
	void displayDetails() {
		System.out.println("recipient :" + recipient);
		System.out.println("message :" + message);
		System.out.println("channel :" + channel);
		System.out.println("priority :" + priority);
		System.out.println();
	}
}

//3. NotificationPayload
//
//Create a class NotificationPayload.
//
//Store:
//
//recipient
//message
//channel
//priority
//
//Possible channels:
//
//EMAIL
//SMS
//PUSH
//
//Create constructors that allow:
//
//recipient only
//recipient + message
//recipient + message + channel
//recipient + message + channel + priority
//
//Requirements:
//
//Use constructor chaining.
//Use this.variable wherever required to distinguish instance variables from parameters.
//Default channel should be PUSH.
//Default priority should be NORMAL.
//
//Concept focus: this + constructor chaining.
