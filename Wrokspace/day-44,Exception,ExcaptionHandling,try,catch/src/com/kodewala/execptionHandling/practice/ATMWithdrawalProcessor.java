package com.kodewala.execptionHandling.practice;

public class ATMWithdrawalProcessor {
	
	public void processWithdraw(int availableBalance, int withdrawalAmount) {
		
		try {
			availableBalance = availableBalance / withdrawalAmount;
			System.out.println("ATM transaction completed");
		}
		catch(ArithmeticException e){
			
			System.out.println("Invalid withdraw amount" + e.getMessage());
			e.printStackTrace();
		}
	}
}

//2. Banking – ATM Cash Withdrawal
//Scenario: An ATM processes cash withdrawals. Sometimes customers enter zero or invalid withdrawal amounts.
//
//Classes:
//- ATMWithdrawalProcessor
//- Driver
//Requirements:
//1. Declare int availableBalance = 50000.
//2. Declare int withdrawalAmount = 0.
//3. Calculate availableBalance / withdrawalAmount.
//4. Handle ArithmeticException.
//5. Print a meaningful error message.
//6. Print "ATM transaction completed" after exception handling.
//7. Test with withdrawal amount 500.
//New learning: ArithmeticException and program execution after catch.
