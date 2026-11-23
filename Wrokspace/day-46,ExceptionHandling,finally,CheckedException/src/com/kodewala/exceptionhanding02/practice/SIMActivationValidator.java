package com.kodewala.exceptionhanding02.practice;

public class SIMActivationValidator {
	
	public void processActivation() {
		
		String simNumber = "8987654321";
		String customerName = "Arth";
		String verificationStatus = "true";
		
		try {
			System.out.println();
			System.out.println(verificationStatus.length());
			System.out.println("SIM activated successfully");	
		}
		catch (NullPointerException e) {
			
			System.out.println("SIM activation failed");
			e.printStackTrace();	
		}
		finally {
			System.out.println("SIM activation process completed");
		}
	}
}

//New Basic 2 – Telecom Technology: SIM Activation Validator
//Basic 2
//Scenario: A telecom application validates SIM card details before activating a new SIM. Sometimes, customer verification details are missing.
//
//Classes:
//- SIMActivationValidator
//- TelecomActivationLogger
//- Driver
//Requirements:
//1. Declare String simNumber = "8987654321".
//2. Declare String customerName = "Rahul".
//3. Declare String verificationStatus = null.
//4. Inside try:
//   - Print SIM number.
//   - Print customer name.
//   - Access verificationStatus.length().
//   - Print "SIM activated successfully".
//5. Catch the exception and print "SIM activation failed".
//6. Inside finally, print "SIM activation process completed".
//7. Call the method from Driver.
//New learning: NullPointerException and exception execution flow.
//
//Your updated practice set will contain only unchecked exceptions and the try-catch-finally concepts you have learned. No checked exceptions, throw, or throws for now.
