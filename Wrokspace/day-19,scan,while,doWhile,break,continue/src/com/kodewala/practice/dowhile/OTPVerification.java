package com.kodewala.practice.dowhile;

import java.util.Scanner;

public class OTPVerification {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = 0; 
		int demoOtp = 564547;
		
		do{
			System.out.println("pls enter the otp");
			int otp = sc.nextInt();
			
			if (otp == demoOtp) {
				System.out.println("Login Verified");
				break;
			}
			else {
				System.err.println("Invalid Otp");
				System.out.println();
			}
			count++;
			
			if(count == 3) {
				System.out.println("Account Temporarily Locked");
			}
			
		}while(count < 3);
		
	sc.close();	
	}

}

//1. OTP Verification Retry
//
//Create a class OTPVerification.
//
//A login system asks the user to enter a 6-digit OTP.
//
//Requirements:
//
//Use Scanner.
//Use a do-while loop.
//Allow the user to try entering the OTP.
//If the OTP is correct, print "Login Verified" and use break.
//If the OTP is incorrect, allow another attempt.
//After 3 failed attempts, print "Account Temporarily Locked" and stop.
//
//Focus: do-while + Scanner + break
