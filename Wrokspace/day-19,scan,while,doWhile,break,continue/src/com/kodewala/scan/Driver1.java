package com.kodewala.scan;

import java.util.Scanner;

public class Driver1 {
	
	public static void main(String[] args) {
		
		//before reading the integer, you are going to make sure that user supply an int.
		Scanner sc = new Scanner(System.in);  //creates connection with console
		int price = 0;
		
		System.out.println("Please enter the price");
		
		if(sc.hasNextInt()) {
			price = sc.nextInt();
		}
		else {
			System.err.println("Please enter the price in right format");
		}
		
		System.out.println("price :" +price);
		
		sc.close();
	}
}
	
	
