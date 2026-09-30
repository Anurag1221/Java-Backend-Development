package com.kodewala.practice;

public class ApiResponseLog {

	public static void main(String[] args) {
		
		int statusCodes[] = {200, 201, 404, 500, 200, 401};
		int count = 0;
		//int co = 0;
		
		for(int i=0; i < statusCodes.length; i++) {
			
			if(statusCodes[i] >= 200) {
				
				count++;
			}
			else if(statusCodes[i] >= 400){
				
				//co++;
			}
		}
		
		System.out.println("Count of 200  Status Codes;" + count);
		System.out.println("Count of 400  Status Codes;" + count++);

	}

}

//1. API Response Status Tracker
//
//Create a class ApiResponseLog.
//
//Store an array of HTTP status codes:
//
//int[] statusCodes = {200, 201, 404, 500, 200, 401};
//
//Using a for loop:
//
//Print every status code.
//Count how many requests returned 200.
//Count how many requests failed (400 or above).
//
//Focus: array + for loop + conditions.
