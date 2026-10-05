package com.kodewala.practice.dowhile;

import java.util.Scanner;

public class CheckoutCoupon {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("pls enter a coupon code");
			String couponCode = sc.nextLine();
			
			if (couponCode.equals("SAVE20")) {
				System.out.println("Coupon Applied");
				break;
			}
			else if(couponCode.equals("SKIP")){
				 System.out.println("No coupon applied");
				 break;
			}
			else {
				System.out.println("Invalid Coupon");
				break;
			}
			
		}while(true);
		
	sc.close();	

	}

}
