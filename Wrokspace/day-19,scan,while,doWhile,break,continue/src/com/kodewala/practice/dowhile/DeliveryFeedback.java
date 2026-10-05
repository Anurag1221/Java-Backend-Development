package com.kodewala.practice.dowhile;

import java.util.Scanner;

public class DeliveryFeedback {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("pls enter the rating(1-5)");
			int rating = sc.nextInt();
			
			if (rating == 0) {
				System.out.println("Wrong rating");
				break;
			}
			
			if(rating == 1) {
				System.err.println("poor");
				break;
			}
			else if (rating == 2){
				System.err.println("modrate");
				break;
			}
			else if (rating == 3){
				System.err.println("good");
			}
			else if (rating == 4){
				System.err.println("very good");
				break;
			}
			else if (rating == 5){
				System.err.println("excelent");
				break;
			}
			else {
				System.out.println("Invalid rating");
				break;
			}
			
		}while(true);
		
	sc.close();	

	}

}
