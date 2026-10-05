package com.kodewala.practice.array;

public class AverageOfArray {

	public static void main(String[] args) {
		
		int arr[] = {2,3,6,5,8,11};
		double sum = 0;
		
		for (int i=0; i<arr.length; i++) {
			
			sum = sum + arr[i];
		}
		
		int len = arr.length;;
		double avg = sum / len;
		System.out.println("Average :" + avg);

	}

}

//Find the average of array elements
