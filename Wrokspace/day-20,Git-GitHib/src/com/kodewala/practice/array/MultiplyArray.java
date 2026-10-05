package com.kodewala.practice.array;

public class MultiplyArray {

	public static void main(String[] args) {
		
		int arr[] = {3,4,5,6,7};
		int arr1[] = arr;
		
		for (int i=0; i<arr.length; i++) {
			
			System.out.print(arr[i] + ",");
		}
		
		System.out.println();
		
		for (int i=0; i<arr1.length; i++) {
			
			System.out.print(arr1[i]*10 + ",");
		}

	}

}

//Multiply each element of array by 10.
