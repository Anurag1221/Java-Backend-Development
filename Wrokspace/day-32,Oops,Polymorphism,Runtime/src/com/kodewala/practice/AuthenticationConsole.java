package com.kodewala.practice;

class AuthenticationMethod {

	public void authenticate(String username) {
		
		System.out.println("AuthenticationMethod.authenticate()");
	}
}

class PasswordAuthentication extends AuthenticationMethod {
	
	@Override
	public void authenticate(String username) {
		
		System.out.println("PasswordAuthentication.authenticate()");
	}
}

class BiometricAuthentication extends PasswordAuthentication {
	
	@Override
	public void authenticate(String username) {
		
		System.out.println("BiometricAuthentication.authenticate()");
	}
}

public class AuthenticationConsole {

	public static void main(String[] args) {

	}

}


//Q5. Multi-Factor Authentication System
//Intermediate
//Classes: AuthenticationMethod, PasswordAuthentication, BiometricAuthentication, AuthenticationConsole
//
//An enterprise login system supports password and biometric authentication. The system stores different authentication objects using one common parent reference.
//
//Requirements
//1. Create authenticate(String username) in the parent class.
//2. Override the method in both child classes.
//3. Create an AuthenticationMethod reference pointing to a BiometricAuthentication object.
//4. Use instanceof to check whether the object is a BiometricAuthentication.
//5. Perform downcasting and call a child-only method named scanFingerprint().
//6. Repeat with a PasswordAuthentication object and handle the type check correctly.
//New concepts: instanceof, safe downcasting, and child-specific methods.
//
//Important: In a real authentication system, never treat a successful type check as proof that a user is authenticated.
