package com.kodewala.string;

public class CountSpaces {

	public static void main(String[] args) {

		String str = "Anurag Ramtekkar kodewala practice";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			 //char ch = str.charAt(i);

			if (str.charAt(i) == ' ') {

				count++;
			}
		}
		System.out.println("Count Spaces :" + count);

	}

}
