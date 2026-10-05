package com.kodewala.practice.array;

public class CountZeroOne {

	public static void main(String[] args) {
		int arr[] = {0,0,1,0,1,0};
		int countZero = 0;
		int countOne = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] == 0) {
				
				countZero++;
			}
			else {
				countOne++;
			}
		}
		System.out.println("Count of zero :" +countZero);
		System.out.println("Count of one :" +countOne);

	}

}
//count the number of zeroes and ones