package com.kodewala.practice.array;

public class FindUnsortedArray {

	public static void main(String[] args) {
		
		int arr[] = {1,3,2,4,5,6};
		//int unsorted = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			
			if(arr[i] <= arr[i-1]) {
				
				System.out.println("Unsorted number :" +arr[i]);
				break;
			}
			
		}
	
	}

}

//Find first unsorted element in array
