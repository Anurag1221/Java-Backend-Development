package com.kodewala.practice;

public class DigitalWallet {

	private int balance;
	
	//constructor use to assign the value in balance
	public DigitalWallet(int balance) {
		super();
		this.balance = balance;
	}

	// setter
	public void addMoney(int amount) {

		if (amount > 0) {
			balance = balance + amount;
		}
	}

	// setter
	public void withdrawMoney(int amount) {
		
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
		}
	}
	
	//getter
	public int getBalance() {
		
		return balance;
	}
}


//Digital Wallet Balance Protection
//Basic
//Classes: DigitalWallet, WalletConsole
//A digital wallet stores the user's available balance.
//Requirements:
//- Keep balance private.
//- Create a constructor to initialize the balance.
//- Create addMoney(int amount).
//- Create withdrawMoney(int amount).
//- Reject zero or negative amounts.
//- Reject withdrawals exceeding the balance.
//- Create getBalance() to read the balance.
//Example: Starting balance ₹2,000; withdraw ₹500; expected balance ₹1,500.
//New concept: Data hiding and input validation.
