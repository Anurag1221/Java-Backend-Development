package com.kodewala.exceptionhanding02;

public class CalculateDiscount {

	public static void main(String[] args) {
		
		CalculateDiscount calculateDiscount = new CalculateDiscount();
		int result =calculateDiscount.calcDiscount(100, 10);
		System.out.println(result);
	}
	
	private int calcDiscount(int amount, int disc) {
		int finalAmt = 0;
		
		try {
			finalAmt = amount - (amount * disc / 100);// risky code
//			String name = null;
//			System.out.println(name.length());
			return finalAmt; // return value has been decided
		}
		catch (Exception e) {
			System.out.println(" some exception");
			e.printStackTrace();
		}
		finally {
			
			finalAmt = 110;
			//return finalAmt; // again returning value decided
		}
		return finalAmt;
		
	}

}
