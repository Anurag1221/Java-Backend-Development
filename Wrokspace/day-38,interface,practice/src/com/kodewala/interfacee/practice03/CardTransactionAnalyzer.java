package com.kodewala.interfacee.practice03;

public class CardTransactionAnalyzer implements IFraudDetectionEngine{
	
	double amount;
    String country;

    CardTransactionAnalyzer(double amount, String country) {
        this.amount = amount;
        this.country = country;
    }

    
	@Override
	public boolean detectSuspiciousTransaction() {
		
		return amount > 50000 || !country.equalsIgnoreCase("India");
	}

	@Override
	public int getRiskScore() {

		 int score = 0;

	        if (amount > 50000) {
	            score += 60;
	        }

	        if (!country.equalsIgnoreCase("India")) {
	            score += 40;
	        }

	        return score;
	}

}
