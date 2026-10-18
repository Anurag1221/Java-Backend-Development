package com.kodewala.practice;

public class LogBatchAssembler {

	public static void main(String[] args) {
		
		StringBuilder logs = new StringBuilder("START"); //

		logs.append(" | AUTH_SUCCESS");
		logs.append(" | CACHE_REFRESH");
		logs.append(" | DATABASE_CONNECTED");
		
		System.out.println(logs); 
		System.out.println(logs.length()); // length --> giving the length of the object
		System.out.println(logs.charAt(0)); // chatAt --> giving the content of the address

	}

}

//Explain why three append() calls do not require three new StringBuilder objects.

// StringBuilder is mutable so if i want to append the content so append same object ,StringBuilder do not create new object
