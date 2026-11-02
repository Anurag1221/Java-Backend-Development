package com.kodewala.interfacee.practice03;

public class Client {

	public static void main(String[] args) {

		IFraudDetectionEngine card = new CardTransactionAnalyzer(40000, "India");
		boolean c1 = card.detectSuspiciousTransaction();
		
		double d1 = card.getRiskScore();
		
		System.out.println("Suspicious" + c1);
		System.out.println("RiskScore" + d1);

	}

}
