package com.kodewala.UserDefine.practice04;

public class Driver {
	
	public static void main(String[] args) {
		 
		TransactionRiskMonitoringService monitoringService = new TransactionRiskMonitoringService();
		monitoringService.processTransaction("TXN-501", 75000, 90);
	}
}
