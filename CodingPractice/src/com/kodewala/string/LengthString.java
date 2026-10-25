package com.kodewala.string;

public class LengthString {

	public static void main(String[] args) {
		
		String str = "Anurag Ramtekkar kodewala practice";
		int count = 0;

		for (char ch : str.toCharArray()) {
            count++;
        }
		System.out.println("Length String" + count);
		
	}

}
