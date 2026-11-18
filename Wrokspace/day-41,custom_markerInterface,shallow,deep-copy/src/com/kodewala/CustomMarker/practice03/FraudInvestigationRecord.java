package com.kodewala.CustomMarker.practice03;

public class FraudInvestigationRecord implements ProtectedEvidence{
	
	String investigationId;
	String transactionReference;
	double suspiciousAmount;
	int riskScore;
	
	FraudInvestigationRecord(String investigationId, String transactionReference, double suspiciousAmount, int riskScore){
		super();
		this.investigationId = investigationId;
		this.transactionReference = transactionReference;
		this.suspiciousAmount = suspiciousAmount;
		this.riskScore = riskScore;
	}
	
//	public void displayDetails() {
//		
//		System.out.println("investigationId;" +investigationId);
//		System.out.println("transactionReference;" +transactionReference);
//		System.out.println("suspiciousAmount;" +suspiciousAmount);
//		System.out.println("riskScore;" +riskScore);
//	}
}
