package com.kodewala.marker.practice02;

public class Driver {

	public static void main(String[] args) {

		// Creating transaction object
		PaymentTransactionRecord transaction = new PaymentTransactionRecord("UPI-TXN-501", 25000.50, "UPI");

		// Creating audit center object
		TransactionAuditCenter auditCenter = new TransactionAuditCenter();
		auditCenter.verifyAuditEligibility(transaction);

		System.out.println("...................)");

		// Passing a non-eligible object
		String paymentStatus = "SUCCESS";

		auditCenter.verifyAuditEligibility(paymentStatus);
	}
}
