package com.kodewala.string;

public class RemoveSpaces {

	public static void main(String[] args) {
		
		String str = "Anurag Ramtekkar kodewala practice";
		String store = "";

		for (int i = 0; i < str.length(); i++) {

			 char ch = str.charAt(i);

			if (ch != ' ') {

				store = store + ch;
			}
		}
		System.out.println("Remove Spaces :" + store);

	}

}
