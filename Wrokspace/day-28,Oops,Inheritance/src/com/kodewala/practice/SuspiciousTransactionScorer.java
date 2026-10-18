package com.kodewala.practice;

//Parent class
class RiskScoringEngine {
	
	public int calculateRiskScore() {
		 
		return 20;
	}
}

//child class
public class SuspiciousTransactionScorer extends RiskScoringEngine{

	@Override
	public int calculateRiskScore() {
		 
		return 85;
	}
}

//Q6 · Intermediate
//Fraud Detection — Risk Scoring
//
//Classes: RiskScoringEngine, SuspiciousTransactionScorer, FraudAnalysisConsole
//A payment company uses different scoring rules for normal and suspicious transactions.
//Requirements:
//- Parent class has a method calculateRiskScore() returning 20.
//- Child class overrides calculateRiskScore() and returns 85.
//- Add @Override to the child method.
//- Create a parent reference pointing to a child object.
//- Call calculateRiskScore() using that reference.
//New concepts: Method overriding, runtime polymorphism, and dynamic method dispatch.
//Challenge: Explain why the output is 85, even though the reference type is the parent class.
