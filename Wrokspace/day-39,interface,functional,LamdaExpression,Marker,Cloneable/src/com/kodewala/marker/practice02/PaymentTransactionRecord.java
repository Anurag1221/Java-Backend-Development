package com.kodewala.marker.practice02;

public class PaymentTransactionRecord implements AuditEligible{

	String transactionId;
	double amount;
	String paymentMode;
	
	public PaymentTransactionRecord(String transactionId, double amount, String paymentMode) {
		super();
		this.transactionId = transactionId;
		this.amount = amount;
		this.paymentMode = paymentMode;
	}
	
	public void displayTransaction() {
		
		System.out.println("transactionId: " + transactionId);
		System.out.println("amount: " + amount);
		System.out.println("paymentMode: " + paymentMode);
	}
	
	
}	
