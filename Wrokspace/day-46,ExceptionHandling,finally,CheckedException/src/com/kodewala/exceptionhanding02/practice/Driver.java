package com.kodewala.exceptionhanding02.practice;

public class Driver {
	 
	public static void main(String[] args) {
		
		//1 problem
//		UPIReceiptGenerator generator = new UPIReceiptGenerator();
//		generator.processGenerator();
		
		//2 problem
//		SIMActivationValidator activationValidator = new SIMActivationValidator();
//		activationValidator.processActivation();
		
		//3 problem
//		LoanEMICalculationEngine calculationEngine = new LoanEMICalculationEngine();
//		calculationEngine.processEMICalculation();
		
		//4 problem
		ShipmentTrackingStatusProcessor processor = new ShipmentTrackingStatusProcessor();
		processor.processShopment();
	}
}
