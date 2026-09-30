package com.kodewala.practice;

public class ServiceHealthMonitor {

	public static void main(String[] args) {

		String str[] = {"UP", "DOWN", "UP", "UP", "DOWN", "UP"};
		int upCount = 0;
		int downCount = 0;
		
		for(int i=0; i < str.length; i++) {
			
			System.out.println("service ;" + str[i]);
			
			if(str[i].equals("UP")) {
				
				upCount++;	
			}
			
			if(str[i].equals("DOWN")) {
				
				downCount++;	
				System.out.println("Alert: Service unavailable");
				System.out.println();
			}
		}
		
		 System.out.println("UP Services: " + upCount);
	     System.out.println("DOWN Services: " + downCount);
		
	}

}

//3. Service Health Checker
//
//Create a class ServiceHealthMonitor.
//
//Store service health values:
//
//String[] status = {"UP", "DOWN", "UP", "UP", "DOWN", "UP"};
//
//Using a for loop:
//
//Print each status.
//Count UP services.
//Count DOWN services.
//If any service is DOWN, print "Alert: Service unavailable".
//
//Focus: String array + loop + condition.
