package com.kodewala.practice;

public class RequestIdValidator {

	public static void main(String[] args) {
		
		String requestIds[] = { "REQ-1001","REQ-1002","REQ-1003","REQ-1004","RE-1004"};
		int count = 0;
		int upCount = 0;
		
		for(int i=0; i < requestIds.length; i++) {
			
			System.out.println("Request ID ;" + requestIds[i]);
			
			if(requestIds[i].startsWith("REQ-")) {
				
				count++;
			}
			else {
				
				upCount++;
			}
		}
		
		 System.out.println("Valid Id count: " + count);
	     System.out.println("Invalid Id count: " + upCount);
		
	} 
}
	
//4. API Request ID Validator
//
//Create a class RequestIdValidator.
//
//Store request IDs:
//
//String[] requestIds = {
//    "REQ-1001",
//    "REQ-1002",
//    "REQ-1003",
//    "REQ-1004"
//};
//
//Using a for loop:
//
//Print every request ID.
//Check whether each ID starts with "REQ-".
//	Print valid and invalid request IDs.
//
//	Focus: String array + for loop + startsWith().
//
//}
