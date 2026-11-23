package com.kodewala.exceptionhanding02.practice;

public class LoanEMICalculationEngine {

	public void processEMICalculation() {

		double loanAmount = 500000;
		double annualInterestRate = 12;
		int tenureMonths = 0;
		double monthlyEMI = 0;

		try {
			// Calculate monthly interest rate
			double monthlyInterestRate = annualInterestRate / 12 / 100;

			// Calculate EMI using simple interest formula
			monthlyEMI = (loanAmount + (loanAmount * monthlyInterestRate * tenureMonths)) / tenureMonths;

			System.out.println("Calculated EMI: " + monthlyEMI);

		} catch (ArithmeticException e) {

			System.out.println("Loan EMI calculation failed");
			e.printStackTrace();
			
		} finally {
			System.out.println("Loan processing attempt completed");
		}
	}
}

//5. Banking Technology – Loan EMI Processing System
//Intermediate 1
//Scenario: A digital lending platform calculates the monthly EMI for a loan. Sometimes, incorrect financial values are received from the loan application.
//
//Classes:
//- LoanEMICalculationEngine
//- LoanProcessingAuditLogger
//- Driver
//Requirements:
//1. Declare double loanAmount = 500000.
//2. Declare double annualInterestRate = 12.
//3. Declare int tenureMonths = 0.
//4. Declare double monthlyEMI = 0.
//5. Inside try:
//   - Calculate the monthly interest rate.
//   - Calculate EMI using the simplified formula below.
//   - Print the calculated EMI.
//6. Catch the exception and print "Loan EMI calculation failed".
//7. Inside finally, print "Loan processing attempt completed".
//8. Print the final EMI in Driver.
//Formula:
//
//For this exercise, use simple interest:
//\[
//EMI = \frac{P + (P \times R \times T)}{T}
//\]
//
//Where:
//- P = Loan amount
//- R = Monthly interest rate (decimal)
//- T = Number of months
//New learning:
//- ArithmeticException
//- Division by zero
//- Financial calculations
//- Multiple statements inside try
