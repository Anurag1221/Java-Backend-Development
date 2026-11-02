package com.kodewala.functional.practice03;

public class FraudDetectionEngine {

	public void displayRiskResult(TransactionRiskAnalyzer riskAnalyzer, double transactionAmount,
			int customerRiskScore) {
		
		// calling method
		riskAnalyzer.displayRiskPolicy();
		
		//store the return value analyzeRisk method
		int store = riskAnalyzer.analyzeRisk(transactionAmount, customerRiskScore);

		System.out.println("transactionAmount: " + transactionAmount);
		System.out.println("customerRiskScore: " + customerRiskScore);

		if (store == 100) {
			System.out.println("High risk");
		} else if (store == 60) {
			System.out.println("Medium Risk");
		} else if (store == 20) {
			System.out.println("Low Risk");
		} else {
			System.out.println("Unknown RisK");
		}
	}
}
