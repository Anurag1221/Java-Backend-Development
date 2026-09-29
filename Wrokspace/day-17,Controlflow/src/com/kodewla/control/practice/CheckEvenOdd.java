package com.kodewla.control.practice;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		
		//creation of an object
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter no. to check Even/Odd");
		int num1 = sc.nextInt();
		
		if(num1 % 2 == 0) {
			System.out.println("Number is Even :" + num1);
		}else {
			System.out.println("Number is Odd :" + num1);
		}
	
	}
}

//Write a program to check whether a number is even or odd using if-else.
//Hint: Use number % 2 == 0 for even numbers.


