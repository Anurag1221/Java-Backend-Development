  package com.kodewala.oops.abstraction;

public class Account {

	// responsible for opening an account
	// RBI --> one Pan can should not have more than 5 account.

	public boolean openAccount(String name, String address, String pan) {

		connectWithDB();
		validateNameAndAddress(name, address);
		validatePan(pan);
		findAccountByPanCard(pan);
		createUserID();
		notifyUser();
		return true;
	}

	//Core Functionalities
	private boolean validateNameAndAddress(String name, String address) {

		System.out.println("Account.validateNameAndAddress()");
		return true;
	}

	//Core Functionalities
	private boolean validatePan(String pan) {

		System.out.println("Account.validatePan()");
		return true;
	}
	
	//Core Functionalities
	private void connectWithDB() {

		System.out.println("Account.connectWithDB()");
	}
	
	//Core Functionalities
	private String createUserID() {

		System.out.println("Account.createUserID()");
		return "some User ID";
	}
	
	//Core Functionalities
	private void notifyUser() {

		System.out.println("Account.notifyUser()");
	}
	
	//Core Functionalities
	private int findAccountByPanCard(String pan) {

		System.out.println("Account.findAccountByPanCard()");
		return 3;
	}
	
}
