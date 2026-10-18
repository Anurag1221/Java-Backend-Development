package com.kodewala.oops.practice;

public class Driver {

	public static void main(String[] args) {

//		// problem 1,single inheritance
//		ObjectStorageConfig config = new ObjectStorageConfig("ap-south-1", "ACTIVE", " customer-documents");
//		config.displayDetails();

		// 2 problem,Multilevel inheritance
//		SecureCardPaymentService payment = new SecureCardPaymentService("TXN2045", "VISA", true);
//
//		payment.validateTransaction();
//		payment.processCardPayment();
//		payment.verifySecurityToken();

		// 3 Hierarchical inheritance
//		TestingEnvironmentConfig testing = new TestingEnvironmentConfig("TESTING", "READY", true);
//		testing.dispalyTesting();
//		
//		ProductionEnvironmentConfig production = new ProductionEnvironmentConfig("PRODUCTION", "READY", true);
//		production.displayProduction();

		// 4 problem
		MultiFactorLoginPolicy login = new MultiFactorLoginPolicy(3);

		// Test 1: Valid OTP
//		System.out.println("Test 1: Valid OTP");
//		login.validateCredentials();

	}

}
