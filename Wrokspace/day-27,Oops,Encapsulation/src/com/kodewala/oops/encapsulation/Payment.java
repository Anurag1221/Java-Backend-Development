package com.kodewala.oops.encapsulation;

public class Payment {

	private int balance; // Data is Variable

	public Payment(int balance) {
		super();
		this.balance = balance;
	}

	// setter
	public void doDebit(int _amount) {

		// Modifying the data
		balance = balance - _amount;
	}

	public void doCredit(int _amount) {

		if (_amount > 0) {
			// Modifying the data
			balance = balance + _amount;
		}
	}
	
	//getter
	public int getBalance() {

		return balance;
	}
}
