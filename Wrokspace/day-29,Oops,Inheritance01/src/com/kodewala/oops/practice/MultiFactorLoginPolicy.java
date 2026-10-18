package com.kodewala.oops.practice;

class AuthenticationPolicyBase {

	int maximumAttempts;

	public AuthenticationPolicyBase(int maximumAttempts) {
		super();
		this.maximumAttempts = maximumAttempts;
	}

	public boolean validateCredentials() {
		System.out.println("Checking username and password");

		// Simulate username and password validation
		return true;
	}
}

public class MultiFactorLoginPolicy extends AuthenticationPolicyBase {

	String correctOTP = "567890";

	public MultiFactorLoginPolicy(int maximumAttempts) {
		super(maximumAttempts);
	}

	@Override
	public boolean validateCredentials() {
		boolean credentialsValid = super.validateCredentials();

		if (!credentialsValid) {
			System.out.println("Login rejected");
			return false;
		}

		System.out.println("Verifying OTP");

		String enteredOTP = "567890";

		if (enteredOTP.equals(correctOTP)) {
			System.out.println("Login approved");
			return true;
		} else {
			System.out.println("Invalid OTP");
			System.out.println("Login rejected");
			return false;
		}
	}
}
