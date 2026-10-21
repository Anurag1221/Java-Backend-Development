package com.kodewala.practice;

//A class can overload methods and also override inherited methods.

class AuthenticationService {

	public void authenticate(String username, String password) {

		System.out.println("AuthenticationService.authenticate(String username, String password)");
	}

	public void authenticate(String username, String password, String otp) {

		System.out.println("AuthenticationService.authenticate(String username, String password, String otp)");
	}
}

public class EnterpriseAuthenticationService extends AuthenticationService{

	@Override
	public void authenticate(String username, String password) {

		System.out.println("EnterpriseAuthenticationService.authenticate(String username, String password)");
	}
	
	@Override
	public void authenticate(String username, String password, String otp) {

		System.out.println("EnterpriseAuthenticationService.authenticate(String username, String password, String otp)");
	}
}

//Q5 · Intermediate · Both concepts
//Multi-Factor Authentication
//
//Classes: AuthenticationService, EnterpriseAuthenticationService
//
//A company login system supports password login and OTP-based login. Enterprise accounts require additional security checks.
//
//Requirements:
//1. Create authenticate(String username, String password) in the parent.
//2. Create authenticate(String username, String password, String otp) in the parent.
//3. Override the two-parameter version in the child class.
//4. Override the three-parameter version in the child class.
//5. Add different messages for standard and enterprise authentication.
//6. Call both versions using a child-class object.
//New concept: A class can overload methods and also override inherited methods.
//
//Challenge: Identify which methods are overloaded and which are overridden.
