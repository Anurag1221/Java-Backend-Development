package com.kodewala.practice;

public class BankAccount {
	int accountNumber;
	String accountHolderName;
	int balance;
	
	BankAccount() {
		System.out.println("BankAccount()");
	}

	BankAccount(int _accountNumber, String _accountHolderName, int _balance) {
		this.accountNumber = _accountNumber;
		this.accountHolderName = _accountHolderName;
		this.balance = _balance;
	}

	void displayDetails() {

		System.out.println("Account Number :" + accountNumber);
		System.out.println("Account Holder Name :" + accountHolderName);
		System.out.println("Balance :" + balance);
		System.out.println();
	}
}

//3. Bank Account — Two Constructors
//
//Create a BankAccount class with:
//
//accountNumber
//accountHolderName
//balance
//
//Create:
//
//A no-argument constructor
//A parameterized constructor accepting all three values.
//
//Create objects using both constructors and display their details.
