package com.kodewala.practice;

public class BankAccountDriver {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount(253672, "Anurag", 51000);
		BankAccount acc1 = new BankAccount();
		
		acc.displayDetails();
		acc1.displayDetails();

	}

}
