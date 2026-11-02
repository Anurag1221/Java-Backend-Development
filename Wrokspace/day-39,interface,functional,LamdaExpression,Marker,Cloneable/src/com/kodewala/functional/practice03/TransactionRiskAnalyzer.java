package com.kodewala.functional.practice03;

public interface TransactionRiskAnalyzer {
	
	//abstract method
	int analyzeRisk(double transactionAmount, int customerRiskScore);
	
	//default method
	default void displayRiskPolicy(){
		
		System.out.println("Analyzing transaction risk...");
	}
}
