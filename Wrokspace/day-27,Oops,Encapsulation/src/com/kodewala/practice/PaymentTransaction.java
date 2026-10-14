package com.kodewala.practice;

public class PaymentTransaction {
	
	private int transactionAmount;
	private String transactionStatus;
	
	public PaymentTransaction(int transactionAmount) {
		super();
		this.transactionAmount = transactionAmount;
		this.transactionStatus = "Pending";
	}
	
	public void processPayment() {
		
		if (transactionStatus.equals("SUCCESS")) {
            System.out.println("Transaction already processed");
            return;
        }
		
		if (transactionAmount <= 0) {
            System.out.println("Invalid transaction amount");
            return;
        }
		
		transactionStatus = "SUCCESS";
        System.out.println("Payment processed successfully");
	}
	
	public int getTransactionAmount() {
        return transactionAmount;
    }
	
	 public String getTransactionStatus() {
	        return transactionStatus;
	 }

}
