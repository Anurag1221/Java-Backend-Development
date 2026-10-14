package com.kodewala.practice;

public class OTPVerificationSession {
	
	int mobileNo;
	String emailID;
	
	public OTPVerificationSession(int mobileNo) {
		super();
		System.out.println("OTPVerificationSession.mobileNo");
		this.mobileNo = mobileNo;
	}

	public OTPVerificationSession(String emailID) {
		super();
		System.out.println("OTPVerificationSession.emailID");
		this.emailID = emailID;
		
	}
	
	//iib
	{
		System.out.println("OTP session initialized");
	}
	
	
}
