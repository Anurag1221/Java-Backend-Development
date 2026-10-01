package com.kodewala.scan;

public class ContinueInJava {

	public static void main(String[] args) {
		//100k
		int[] numbers = { 45, -12, 78, -34, 56, -89, 23, -7, 91, -45, 16, -63, 72, -28, 39, -5, 84, -76, 11, -52, 67,
				-19, 33, -95 };
		
		//multiply +ve number by 10
		for(int i=0; i<numbers.length; i++) {
			
			int currentNumber = numbers[i];
			
			if(currentNumber < 0) {
				continue;// skip the current iteration
			}
			
			System.out.println(currentNumber*10); //biz --> 100 lines
		}

	}

}
