package com.kodewala.practice;

import java.util.Scanner;

public class ATMTransactionConsole {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        ATMTransactionConsole atm = new ATMTransactionConsole();

        System.out.println("ATM Transaction Console");
        System.out.println("1 → Cash Withdrawal");
        System.out.println("2 → Cash Deposit");
        System.out.println("3 → Balance Inquiry");
        System.out.println("4 → Mini Statement");
        System.out.println("0 → Exit");

        System.out.print("Enter transaction option: ");
        int option = sc.nextInt();

        atm.processTransaction(option);

        sc.close();
    }

    public void processTransaction(int option) {

        if (option == 0) {
            System.out.println("ATM session terminated.");
            return;
        }

        switch (option) {

        case 1:
            System.out.println("Cash Withdrawal option selected");
            break;

        case 2:
            System.out.println("Deposit option selected");
            break;

        case 3:
            System.out.println("Balance Inquiry option selected");
            break;

        case 4:
            System.out.println("Mini Statement option selected");
            break;

        default:
            System.out.println("Invalid transaction option");
            break;
        }

        System.out.println("Transaction processing completed.");
    }

}
