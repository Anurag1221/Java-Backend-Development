package com.kodewala.practice;

public class BankAccount {
	int accountNumber;
	int balance;
	
	BankAccount(int _accountNumber, int _balance){
		this.accountNumber = _accountNumber;
		this.balance = _balance;
	}
	
	void showAccountDetails() {
		System.out.println("accountNumber :" + accountNumber);
		System.out.println("balance :" + balance);
	}
}

class SavingAccount extends BankAccount{
	
	int interestRate;
	
	SavingAccount(int accountNumber, int balance,int _interestRate){
		super(accountNumber, balance);
		
		this.interestRate = _interestRate;
	}
	
	void displaySavingAccount() {
		super.showAccountDetails();
		System.out.println("interestRate :" + interestRate);
	}
	
}

//3. Bank Account
//
//Create a parent class BankAccount:
//
//accountNumber
//balance
//Method showAccountDetails()
//
//Create a child class SavingsAccount:
//
//interestRate
//
//Requirements:
//
//Initialize parent variables using super().
//Call the parent method using super.showAccountDetails().
//Display interestRate.
//
//Focus: super() + super.method().