package com.kodewala.UserDefine.Exception;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Driver.main() START");
		
		PaymentMgmt mgmt = new PaymentMgmt();
		
		try {
			mgmt.doPayment("6535653432", 1200);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Driver.main() END");
	}

}
