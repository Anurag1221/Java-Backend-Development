package com.kodewala.practice.array;

public class ReturnSumPlusMinus {

	public static void main(String[] args) {
		
		int arr[] = {-10,20,-30,40,-50,60};
		int plus = 0;
		int minus = 0;
		
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] > 0) {
				
				plus = plus + arr[i];
			}
			else {
				minus = minus + arr[i];
			}
		}
		System.out.println("Return Sum +ve :" +plus);
		System.out.println("Return Sum -ve :" +minus);
	}

}
//return sum of +ve and -ve numbers
