package com.kodewala.practice;

public class ReverseString {

	public static void main(String[] args) {
		
		String str[] = {"Anurag","Arth","Ashay","Rahul"};
		String reverse = "";
		
		for (int i = str.length-1; i >= 0; i--) {
			
			reverse = reverse + str[i] + " ";
		}
		System.out.println(reverse);
		

	}

}
