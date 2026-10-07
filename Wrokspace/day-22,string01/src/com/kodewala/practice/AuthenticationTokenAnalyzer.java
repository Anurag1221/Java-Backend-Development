package com.kodewala.practice;

public class AuthenticationTokenAnalyzer {

	public static void main(String[] args) {
		
		String token1 = "AUTH-2026-USER-4589";
		String token2 = "AUTH-2026-USER-4589";
		String token3 = new String("AUTH-2026-USER-4589");
		String token4 = new String("AUTH-2026-USER-4589");
		
		System.out.println(token1 == token2); // true
		System.out.println(token1 == token3); // false 
		System.out.println(token1 == token4); // false
		
		System.out.println(token2 == token3); // false
		System.out.println(token2 == token4); // false
		
		System.out.println(token3 == token4); // false

	}

}
