package com.kodewala.exceptionHanding01;

public class StreamingProfileService {

	public static void main(String[] args) {
		
		StreamingProfileService profileService = new StreamingProfileService();
		profileService.processProfile();
	}
	
	public void processProfile() {
		
		String subscriberNickname = "bhchb";
		
		try {
			System.out.println("Subscriber name: " +subscriberNickname.toUpperCase());
		}
		catch(NullPointerException e){
			
			System.out.println("Subscriber profile is unavailable");
		}
		
		System.out.println("Profile request finished");
	}	

}

//3. OTT Streaming – Subscriber Profile Retrieval
//Concept: NullPointerException
//
//Scenario: A streaming application receives a subscriber's nickname from a profile service. Sometimes the profile service returns null.
//
//Classes:
//- StreamingProfileService
//- Driver
//Requirements:
//1. Declare String subscriberNickname = null.
//2. Inside try, call subscriberNickname.toUpperCase().
//3. Catch NullPointerException.
//4. Print "Subscriber profile is unavailable".
//5. After the catch block, print "Profile request finished".
//New thing you will learn: How to handle unexpected null values when accessing an object.
