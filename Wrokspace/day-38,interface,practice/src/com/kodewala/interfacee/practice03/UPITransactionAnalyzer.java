package com.kodewala.interfacee.practice03;

public class UPITransactionAnalyzer implements IFraudDetectionEngine{

	double amount;
    int transactionsPerMinute;

    UPITransactionAnalyzer(double amount, int transactionsPerMinute) {
        this.amount = amount;
        this.transactionsPerMinute = transactionsPerMinute;
    }

    public boolean detectSuspiciousTransaction() {
        return amount > 10000 || transactionsPerMinute > 5;
    }

	@Override
	public int getRiskScore() {
		int score = 0;

        if (amount > 10000) {
            score += 50;
        }

        if (transactionsPerMinute > 5) {
            score += 50;
        }

        return score;
	}


}
