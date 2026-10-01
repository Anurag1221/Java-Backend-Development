package com.kodewala.practice.whileloop;

import java.util.Scanner;

public class OTPVerification {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int correctOtp = 4000;
		int attempts = 0;
		// checking the otp verification

		while (attempts < 3) {

			System.out.println("Enter otp");
			int otp = sc.nextInt();
			
			// if entered otp 0 stop the verification using break
			if (otp == 0) {
                System.out.println("Verification stopped.");
                break;
            }
			
			if (otp == correctOtp) {

				System.out.println("OTP Verified Successfully");
				System.out.println();
				return;
			} 
			else {
				System.err.println("Invalid OTP");
				System.out.println();
				attempts++;
			}

			if (attempts == 3) {
				System.err.println("Too many attempts,Try again after 24 hours");
			}
		}

	sc.close();
	}
	
}

//Create a class OTPVerification.
//
//A user has a maximum of 3 attempts to enter the correct OTP.
//
//Requirements:
//Generate/store a fixed OTP such as 4826.
//Use Scanner to take the OTP from the user.
//Use a while loop for the attempts.
//If the OTP is correct:
//Print "OTP Verified Successfully"
//Use return.
//If the OTP is incorrect:
//Print "Invalid OTP"
//Increase the attempt count.
//After 3 incorrect attempts:
//Print "Too many attempts. Try again later."
//If the user enters 0, stop verification using break.
//
//Concepts: while, Scanner, break, return