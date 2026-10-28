package com.kodewala.practice;
//Encapsulation
class DigitalWallet {

	// balance is private to achieve encapsulation
	private int balance;

	// constructor use to assign the object
	public DigitalWallet(int balance) {
		super();
		if (balance > 0) {

			this.balance = balance;
		} else {
			System.out.println("Invalid amount enter");
		}

	}

	// setBalance use to set the balance of the wallet
	public void setBalance(int amount) {

		if (balance > 0) {
			balance = balance + amount;
			System.out.println("Money added successfully.");
		} else {
			System.out.println("Invalid amount enter");
		}

	}

	// setwithdrawal use to set the withdraw amount
	public void setwithdrawal(int amount) {

		if (balance >= amount) {

			balance = balance - amount;
			System.out.println("Withdrawal successful.");
		} else {
			System.out.println("Invalid withdrawal amount enter");
		}
	}

	// getBalace method give the actual Balance of the wallet
	public int getBalance() {

		return balance;
	}
}

public class WalletService {

	public static void main(String[] args) {

		// Create a wallet with an initial balance of 1000.
		DigitalWallet digitalWallet = new DigitalWallet(1000);

		 // Add money to the wallet.
		digitalWallet.setBalance(1000);
		
		//check the wallet balance
		System.out.println("Wallet Balance" + digitalWallet.getBalance());

		 // Withdraw money from the wallet.
		digitalWallet.setwithdrawal(1000);

		//check the wallet balance
		System.out.println("Wallet Balance" + digitalWallet.getBalance());
	}
}

/**
 * Q1. Digital Wallet Security
Basic · Encapsulation
Classes: DigitalWallet, WalletService

A digital wallet application must protect its available balance from unauthorized changes.

Requirements
1. Keep balance private.
2. Create a method to add money.
3. Create a method to withdraw money.
4. Prevent withdrawals greater than the available balance.
5. Reject zero or negative transaction amounts.
6. Display the updated balance through a method.
New learning: Data hiding, validation, and controlled access to sensitive data.**/
