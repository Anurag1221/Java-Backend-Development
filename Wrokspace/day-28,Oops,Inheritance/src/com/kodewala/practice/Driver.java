package com.kodewala.practice;

public class Driver {

	public static void main(String[] args) {

		// problem 1
		// direct access parent class
//		CloudServiceConfig config = new CloudServiceConfig("ap-south-1", "Active");
//		config.displayConfig();

		// child class --> use the parent class variable,method
//		ObjectStorageConfig store = new ObjectStorageConfig("ap-south-1", "Active", "user-backup");
//		store.displayDetails();

		// problem 2
//		LoginAuditRecord log = new LoginAuditRecord(2583, 5);
//		
//		log.displayID(); //parent class method
//		log.checkInvestigationStatus(); //child class method

		// problem 3
//		ColdChainShipment shipment = new ColdChainShipment("101", "35C");
//		
//		shipment.displayStatus();

		// problem 4
//		InternationalTransferFee fee = new InternationalTransferFee(10000, 10);
//		
//		fee.displayTransfer();

//		//problem 5
//		ProductionEnvironmentConfig config = new ProductionEnvironmentConfig("Production", true);
//		config.displayApproral();

		// 6 problem
		// Parent reference pointing to child object
//		RiskScoringEngine engine = new SuspiciousTransactionScorer();
//
//		// Calling the overridden method
//		int riskScore = engine.calculateRiskScore();
//
//		System.out.println("Transaction Risk Score: " + riskScore);

		// 7 problem
//		CriticalInfrastructureAlert alert = new CriticalInfrastructureAlert();
//		
//		alert.sendAlert();

		// 8 problem
		// Parent reference pointing to the final child object
		InfrastructureRecoveryBase recovery = new RegionalFailoverWorkflow("DB-SVC-104");

		// Recover only when validation succeeds
		if (recovery.validateRecovery()) {
			recovery.recover();
		} else {
			System.out.println("Recovery failed: service ID is blank");
		}
	}

}
