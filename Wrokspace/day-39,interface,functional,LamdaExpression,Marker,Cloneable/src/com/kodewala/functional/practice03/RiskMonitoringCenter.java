package com.kodewala.functional.practice03;

public class RiskMonitoringCenter {
	
	public static void main(String[] args) {
		
		TransactionRiskAnalyzer analyzer = (transactionAmount, customerRiskScore) -> {
				
			if(transactionAmount >= 50000 && customerRiskScore >= 70 ) {
				return 100;
			}
			else if(transactionAmount >= 20000 && customerRiskScore >= 50 ){
				
				return 60;
			}
			else {
				return 20;
			}
		};
		
		FraudDetectionEngine detectionEngine = new FraudDetectionEngine();
		detectionEngine.displayRiskResult(analyzer, 50000, 70);
		
		
	}
}
