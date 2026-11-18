package com.kodewala.execptionHandling.practice01;

public class TransactionAuditLogger {

	public void logTransactionFailure(String message, Exception e) {

		System.out.println("----- TRANSACTION AUDIT LOG -----");

		System.out.println("Failure Reason: " + message);

		System.out.println("Exception Type: " + e.getClass().getSimpleName());

		System.out.println("Exception Message: " + e.getMessage());

		e.printStackTrace();

		System.out.println("---------------------------------");
	}
}
