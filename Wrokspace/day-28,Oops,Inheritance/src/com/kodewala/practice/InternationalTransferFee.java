package com.kodewala.practice;

class TransactionFeeBase {

	int transactionAmount;

	public TransactionFeeBase(int transactionAmount) {
		super();
		this.transactionAmount = transactionAmount;
	}

	public int calculateBaseFee() {

		return (transactionAmount * 2) / 100;
	}

}

public class InternationalTransferFee extends TransactionFeeBase {

	int internationalFee;

	public InternationalTransferFee(int transactionAmount, int internationalFee) {
		super(transactionAmount);
		this.internationalFee = internationalFee;
	}

	public void displayTransfer() {

		double baseFee = calculateBaseFee();
		double extraFee = transactionAmount * internationalFee / 100.0;
		double finalFee = baseFee + extraFee;

		System.out.println("Transaction Amount :" + transactionAmount);
		System.out.println("Base Fee: " + baseFee);
		System.out.println("International Transfer Fee :" + extraFee);
		System.out.println("Final Fee: " + finalFee);
	}

}

//Q4 · Basic
//Payment Processing — Transaction Fees
//
//Classes: TransactionFeeBase, InternationalTransferFee, FeeEstimateConsole
//A payment platform charges a standard processing fee and an extra international transfer fee.
//Requirements:
//- Parent class has transactionAmount.
//- Create calculateBaseFee() returning 2% of the amount.
//- Child class adds internationalFee.
//- Calculate the final fee by adding both fees.
//- Display the base fee and final fee.
//New concept: Reusing a parent's calculation method.
