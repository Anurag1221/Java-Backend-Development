package com.kodewala.UserDefine.practice04;

public class TransactionRiskMonitoringService {

	public void processTransaction(String transactionId, int transactionAmount, int riskScore) {

		try {
			validateTransaction(transactionId, transactionAmount, riskScore);
		} catch (HighRiskTransactionException e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public void validateTransaction(String transactionId, int transactionAmount, int riskScore)
			throws HighRiskTransactionException {
		
		System.out.println("========== PAYMENT AUDIT LOG ==========");
		System.out.println("Transaction ID: " + transactionId);
		System.out.println("Transaction Amount: Rs. " + transactionAmount);
		System.out.println("Risk Score: " + riskScore);
		System.out.println("Transaction Status: BLOCKED");
		System.out.println("Reason: High-risk transaction detected.");
		System.out.println("=======================================");

		if (transactionAmount > 50000 && riskScore > 80) {
			throw new HighRiskTransactionException(
					"Transaction blocked! High-risk transaction detected. " + "Transaction ID: " + transactionId
							+ ", Amount: Rs. " + transactionAmount + ", Risk Score: " + riskScore);
		} else {
			System.out.println("Transaction approved successfully.");
		}
	}
}
