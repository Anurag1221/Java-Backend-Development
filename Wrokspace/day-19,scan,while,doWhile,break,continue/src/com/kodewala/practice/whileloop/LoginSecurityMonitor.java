package com.kodewala.practice.whileloop;

import java.util.Scanner;

public class LoginSecurityMonitor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int attempts = 0;
		int demoPin = 3421;
		
		while(attempts < 3) {
			
			System.out.println("Enter the pin");
			int pin = sc.nextInt();
			
			if(pin < -1) {
				System.out.println("Login process cancelled");
				break;
			}
			
			if(demoPin == pin) {
				System.out.println("Login Successful");
				return;
			}
			else {
				System.out.println("Incorrect PIN");
				System.out.println();
				attempts++;
				continue;	
			}
				
		}
		if(attempts == 3) {
			System.out.println("Account Locked");
		}
		
		sc.close();
	}

}

//4. Mobile Login Security
//
//Create a class LoginSecurityMonitor.
//
//A mobile application allows a user to enter a PIN.
//
//Requirements:
//Store a fixed PIN.
//Give the user a maximum of 3 attempts.
//Use Scanner.
//Use a while loop.
//If the PIN is correct:
//Print "Login Successful"
//Use return.
//If the PIN is wrong:
//Print "Incorrect PIN"
//Continue to the next attempt.
//If the user enters -1, cancel the login process using break.
//After 3 failed attempts:
//Print "Account Locked"
//
//Concepts: while, Scanner, break, return
