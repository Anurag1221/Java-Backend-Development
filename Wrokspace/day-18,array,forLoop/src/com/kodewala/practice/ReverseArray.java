package com.kodewala.practice;

public class ReverseArray {

	public static void main(String[] args) {
		
		int arr[] = {10,40,50,90,20};
		
		for(int i=arr.length-1; i>=0; i--) {
			
			System.out.println("Reverse the array :" + arr[i]);
		}

	}

}
