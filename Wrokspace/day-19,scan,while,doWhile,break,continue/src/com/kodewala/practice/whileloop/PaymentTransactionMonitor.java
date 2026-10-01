package com.kodewala.practice.whileloop;

import java.util.Scanner;

public class PaymentTransactionMonitor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int noTran = 0;
		int totalAmount = 0;
		
		while(totalAmount < 100000) {
			
			System.out.println("Pls enter the amount");
			int amount = sc.nextInt();
			
			if(amount == 0) {
				continue;
			}
			
			if(amount < 0) {
				System.out.println("Invalid transaction");
				continue;
			}
			
			if(amount < -999) {
				break;
			}

				totalAmount = totalAmount + amount;
				noTran++;
			
			if(totalAmount >= 100000) {
				System.out.println("Transaction monitoring limit reached");
				break;
			}
		}
		System.out.println("Number of transactions :" + noTran);
		System.out.println("Total transaction amount :" + totalAmount);
		
		sc.close();
	}

}

//5. Payment Transaction Monitor
//
//Create a class PaymentTransactionMonitor.
//
//A payment system receives transaction amounts continuously.
//
//Requirements:
//
//Use Scanner to enter transaction amounts.
//
//Rules:
//
//Positive amount → valid transaction
//0 → ignore transaction
//Negative amount → invalid transaction
//-999 → stop monitoring
//Your program should:
//Use a while loop.
//Read transaction amounts continuously.
//If the amount is 0, use continue.
//If the amount is negative, print "Invalid transaction" and use continue.
//For valid transactions, maintain:
//Number of transactions
//Total transaction amount
//If total transaction amount reaches ₹1,00,000, print:
//"Transaction monitoring limit reached"
//and use break.
//If the user enters -999, stop the program.
//Finally display the transaction count and total amount.
//
//Concepts: while, Scanner, continue, break, counters, accumulation