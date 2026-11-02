package com.kodewala.marker.practice02;

public class TransactionAuditCenter {
	
	public void verifyAuditEligibility(Object obj) {
		
		// Runtime type checking
        if (obj instanceof AuditEligible) {

            System.out.println("Eligible for Audit");

            PaymentTransactionRecord record =
                    (PaymentTransactionRecord) obj;

            record.displayTransaction();

        } else {

            System.out.println("Not Eligible for Audit");
        }
	}
}
