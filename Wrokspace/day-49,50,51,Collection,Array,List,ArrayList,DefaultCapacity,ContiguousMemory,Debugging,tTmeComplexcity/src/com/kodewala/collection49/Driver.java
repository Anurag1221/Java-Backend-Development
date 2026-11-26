package com.kodewala.collection49;

//1.store - store the data
//2. process - perform sum operation into the data or modify it.
//3.store - store modify data
//4.updated data use user
public class Driver {

	public static void main(String[] args) {
		
		//1. store the price --> container(box) which hold integer values
		int arr[] = {100, 500, 400, 500, 5645, 1003, 6462, 6463};
		
		System.out.println(arr[5]);
		
		//2. process --> find the price value above 1000
		for (int i = 0; i < arr.length; i++) {
			
			int currentPrice = arr[i];
			
			if(currentPrice > 1000) {
				
				System.out.println(currentPrice);
			}
		}

	}

}
