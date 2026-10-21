package com.kodewala.oops.practice;

public class ATMWithdrawalService {

	private int availableBalance;
	private int correctPIN = 1234;

	public ATMWithdrawalService(int availableBalance, int correctPIN) {
		super();
		this.availableBalance = availableBalance;
		this.correctPIN = correctPIN;
	}

	void checkBalance() {
		System.out.println("Available Balance: ₹" + availableBalance);
	}

	public void verifyPIN(int enteredPIN) {

		if (enteredPIN == correctPIN) {
			System.out.println("PIN verified successfully.");
		} else {
			System.out.println("Invalid PIN.");
		}
	}

	public void withdrawCash(int amount) {

		availableBalance = availableBalance - amount;
	}

	public void dipositCash(int amount) {

		availableBalance = availableBalance + amount;
	}
}

//Q3. ATM Cash Withdrawal

//Class: ATMWithdrawalService
//
//A customer wants to withdraw money from an ATM.
//
//Requirements:
//1. Create a variable availableBalance.
//2. Create checkBalance().
//3. Create verifyPIN().
//4. Create withdrawCash(int amount).
//5. Display the remaining balance.
//Learn: Keeping operations inside a class.
