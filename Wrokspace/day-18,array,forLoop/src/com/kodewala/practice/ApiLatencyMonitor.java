package com.kodewala.practice;

public class ApiLatencyMonitor {

	public static void main(String[] args) {
		
		int[] responseTimes = {120, 450, 80, 900, 230, 150};
		 
		int highest = responseTimes[0];
        int lowest = responseTimes[0];

        for (int i = 0; i < responseTimes.length; i++) {

            // Print every response time
            System.out.println("Response Time: " + responseTimes[i] + " ms");

            // Find highest response time
            if (responseTimes[i] > highest) {
                highest = responseTimes[i];
            }

            // Find lowest response time
            if (responseTimes[i] < lowest) {
                lowest = responseTimes[i];
            }

            // Check slow API
            if (responseTimes[i] > 500) {
                System.out.println("Slow API");
            }
        }

        System.out.println("Highest Response Time: " + highest + " ms");
        System.out.println("Lowest Response Time: " + lowest + " ms");
        
	}   

}

//2. API Response Time Monitor
//
//Create a class ApiLatencyMonitor.
//
//Store response times in milliseconds:
//
//int[] responseTimes = {120, 450, 80, 900, 230, 150};
//
//Using a for loop:
//
//Print every response time.
//Find the highest response time.
//Find the lowest response time.
//Print "Slow API" if response time is greater than 500.
//
//Focus: array + loop + comparison.
