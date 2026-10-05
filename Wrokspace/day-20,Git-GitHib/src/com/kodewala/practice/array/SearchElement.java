package com.kodewala.practice.array;

public class SearchElement {

	public static void main(String[] args) {
		
		int arr[] = {2,3,5,6,7};
		int value = 3;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] == value) {
				System.out.println("Value inside the array :" + arr[i]);
				break;
			}
			else {
				System.out.println("Value not in inside the array :" + arr[i]);
			}
		}

	}

}
//Search for an element in an array{Linear SearchS}
