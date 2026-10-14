package com.kodewala.oops.encapsulation;

public class Driver {

	public static void main(String[] args) {
		
//		Payment payment = new Payment(1000);
//		
//		payment.doDebit(200);
//		payment.doCredit(2000);
//		
//		System.out.println(payment.getBalance());
//		
		
		Transaction transfer = new Transaction("Anurag", "76357653665", 1000);
		
		transfer.doTransfer(400);
		
		System.out.println(transfer.getBalance());
	}

}
