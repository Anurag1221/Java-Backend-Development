package com.kodewala.practice;

import java.util.Scanner;

public class CloudStoragePlan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CloudStoragePlan plan  = new CloudStoragePlan();
		
		System.out.println("Choose Cloud Storage Plan:");
        System.out.println("1 → 50 GB");
        System.out.println("2 → 200 GB");
        System.out.println("3 → 1 TB");
        System.out.println("4 → 2 TB");
        System.out.println("0 → Exit");
		
		System.out.println("Check cloud storage plan,Enter the plan no.");
		int number = sc.nextInt();
		
		plan.displayPlan(number);
		
	sc.close();

}
	
public void displayPlan(int number) {
	
		if(number == 0) {
			System.out.println("Exiting...");
			return;
		}
		
		switch (number) {
		case 1:
			System.out.println("50 GB");
			break;
		case 2:
			System.out.println("200 GB");
			break;
		case 3:
			System.out.println(" 1 TB");
			break;
		case 4:
			System.out.println("2 TB");
			break;	
		default:
			System.out.println("Invalid Cloud Storage plan");
			break;
		}
	}

}
