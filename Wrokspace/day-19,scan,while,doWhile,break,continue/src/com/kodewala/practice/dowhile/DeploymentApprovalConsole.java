package com.kodewala.practice.dowhile;

import java.util.Scanner;

public class DeploymentApprovalConsole {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n--- Deployment Console ---");
        System.out.println("1. Approve Deployment");
        System.out.println("2. Reject Deployment");
        System.out.println("3. Request Code Review");
        System.out.println("4. Run Security Scan Again");
        System.out.println("5. Cancel Deployment");
        System.out.println("0. Exit");
		
		do{
			
            System.out.println("Enter your decision:");
			int code = sc.nextInt();
			
			if (code == 0) {
				System.out.println("Exit");
				break;
			}
			
			if(code == 1) {
				System.err.println("Approve Deployment");
			}
			else if (code == 2){
				System.err.println("Reject Deployment");
			}
			else if (code == 3){
				System.err.println("Request Code Review");
			}
			else if (code == 4){
				System.err.println(" Run Security Scan Again");
			}
			else if (code == 5){
				System.err.println(" Cancel Deployment");
				break;
			}
			else {
				System.out.println("Invalid Decision");
				continue;
			}
			
		}while(true);

		
	sc.close();	
		

	}

}
