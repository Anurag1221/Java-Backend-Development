package com.kodewala.practice;

//parent class 
class SecurityAlertHandler {

	public void handleAlert(String source) {

		System.out.println("SecurityAlertHandler.handleAlert()");
	}
}

//child class
class SuspiciousLoginHandler extends SecurityAlertHandler{
	
	@Override
	public void handleAlert(String source) {

		System.out.println("SuspiciousLoginHandler.handleAlert()");
	}
}

//child class
class MalwareAlertHandler extends SuspiciousLoginHandler{
	
	@Override
	public void handleAlert(String source) {

		System.out.println("MalwareAlertHandler.handleAlert()");
	}
}

public class SecurityConsole {

	public static void main(String[] args) {
		
		 // Parent reference pointing to suspicious login object
        SecurityAlertHandler handler;

        handler = new SuspiciousLoginHandler();
        handler.handleAlert("Unknown IP address");

//        System.out.println("---------------------------");
//
//        // Same parent reference pointing to malware alert object
//        handler = new MalwareAlertHandler();
//        handler.handleAlert("Employee laptop");
	}

}

////Q3. Security Alert Handling
//Basic
//Classes: SecurityAlertHandler, SuspiciousLoginHandler, MalwareAlertHandler, SecurityConsole
//
//A company's security system detects suspicious logins and malware alerts. Each alert needs a different response.
//
//Requirements
//1. Create handleAlert(String source) in the parent class.
//2. Override it in both child classes.
//3. Store each child object in a parent reference.
//4. Call handleAlert() through the parent references.
//5. Observe which implementation executes.
//New concept: The reference type determines which methods are accessible; the actual object determines which overridden method runs.
