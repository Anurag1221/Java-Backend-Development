package com.kodewala.practice.array;

public class MaximumElement {

	public static void main(String[] args) {
		
		int arr[] = {10,50,30,20,60};
		int max = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum Element :" +max);
	}

}
//Find the maximun element in an array
