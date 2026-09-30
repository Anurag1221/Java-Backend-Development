package com.kodewala.practice;

public class CountEven {

	public static void main(String[] args) {
		
		int arr[] = {15,50,30,10,55,70};
		int count = 0;
		
		for(int i=0; i < arr.length; i++) {
			
			if(arr[i] % 2 == 0) {
				
				count++;	
			}
		}
		
		System.out.println(" Count Even Numbers ;" + count);

	}
}


