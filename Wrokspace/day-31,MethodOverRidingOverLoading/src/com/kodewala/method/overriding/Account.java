package com.kodewala.method.overriding;

public class Account {
	
	int minBalance = 10000;
	
	public String openAccount(String name, int intBal) {

		// some... 100 line of code --> x
		System.out.println("Account.openAccount()...........");
		return "some string";
	}

}

class SavingAccount extends Account {

	// 1. Method name should be same.
	// 2. Type,Order and Number of args should be same
	// 3. Return type should be same except covariant
	// 4. Access modifier --> should be same or widen(public --> public,
	// protected --> protected or public)

	@Override // you are telling compiler that - i am overriding the method. (public check all the rules.)
	public String openAccount(String name, int intBal) {

		// some... 100 line of code --> x
		System.out.println("Account.openAccount()...........");
		return "some string";
	}
}
