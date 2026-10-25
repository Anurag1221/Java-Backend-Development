package com.kodewala.string;

public class CountUppercaseLowercase {

	public static void main(String[] args) {

		String str = "Anurag Ramtekkar Kodewala Practice";
		int upperCase = 0;
		int lowerCase = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {
				upperCase++;
				
			} else if (ch >= 'a' && ch <= 'z') {
				lowerCase++;
				
			}

		}

		System.out.println("Count Uppercase :" + upperCase);
		System.out.println("Count lowerCase :" + lowerCase);

	}

}
