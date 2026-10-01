package com.kodewala.practice.whileloop;

import java.util.Scanner;

public class DeploymentMonitor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count =  0;
		
		while(true) {
			
			System.out.println("Enter deployment status code");
			int code = sc.nextInt();
			
			if(code == 0) {
				System.out.println("Stop Monitoring");
				break;
			}
			
			if(code == 1) {
				System.out.println("Deployment Started");
			}
			else if(code == 2) {
				System.out.println("Deployment In Progress");
			}
			else if(code == 3) {
				System.out.println("Deployment Successful");
				return;
			}
			else if(code == 4) {
				System.out.println("Deployment Failed");
			}
			else if(code == 5) {
				System.out.println("Rollback Required");
				count++;
				
				if(count == 3) {
					System.out.println("Deployment pipeline stopped");
					break;
				}
			}
			else {
				System.out.println("Invalid deployment status");
				continue;
			}
				
		}
		sc.close();

	}

}

//6. Cloud Server Deployment Monitor
//
//Create a class DeploymentMonitor.
//
//A deployment system checks server deployment status repeatedly.
//
//The user enters:
//
//1 → Deployment Started
//2 → Deployment In Progress
//3 → Deployment Successful
//4 → Deployment Failed
//5 → Rollback Required
//0 → Stop Monitoring
//Requirements:
//Use Scanner.
//Use a while loop.
//Keep accepting deployment statuses.
//If status is 3:
//Print "Deployment Successful"
//Use return.
//If status is 4:
//Print "Deployment Failed"
//Continue monitoring.
//If status is 5:
//Print "Rollback Required"
//Increase a rollback counter.
//If rollback occurs 3 times, print:
//"Deployment pipeline stopped"
//and use break.
//If status is invalid, print "Invalid deployment status" and use continue.
//Status 0 should stop monitoring.
//
//Concepts: while, Scanner, break, continue, return