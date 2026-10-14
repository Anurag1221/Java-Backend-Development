package com.kodewala.practice;

public class CloudStorageSession {
	
	String sessionStatus;
	String sessinID;
	
	//iib 
	{
		sessionStatus = "ACTIVE";
		System.out.println("Session initialized");
	}

	public CloudStorageSession(String sessinID) {
		super();// run 1 line
		// run iib 2 line
		System.out.println("CloudStorageSession.CloudStorageSession()");
		this.sessinID = sessinID;
	}
	
}
