package com.kodewala.practice;

public class LoginAttemptGuard {

	private int failedAttempts;
	private  boolean accountLocked;

	public void recordFailedLogin() {
		
		// block the account
		if (accountLocked) {

			System.out.println("Account is already locked");
			return;
		}
		
		//increase the count
		failedAttempts++;
		System.out.println("Failed login attempts: " + failedAttempts);
		
		//check attempts
		if (failedAttempts == 3) {

			accountLocked = true;
			System.out.println("Account locked due to repeated failures");
		}

	}
	
	//getter of account locked
	public boolean isAccountLocked() {

		return accountLocked;
	}
}

//03
//
//Login Attempt Protection
//Classes: LoginAttemptGuard, SecurityMonitorConsole
//A website temporarily locks login access after repeated failures.
//Requirements:
//- Keep failedAttempts private.
//- Keep accountLocked private.
//- Create recordFailedLogin().
//- Lock access after 3 failed attempts.
//- Do not increase attempts after the account is locked.
//- Provide isAccountLocked().
//Example: Three failed attempts should lock the account.
//New concept: State protection and controlled state changes.
