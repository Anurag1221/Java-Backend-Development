package com.kodewala.practice;

public class Driver {

	public static void main(String[] args) {
		// 1 problem
//		DigitalWallet wallet = new DigitalWallet(2000);
//		
//		wallet.withdrawMoney(500);
//		
//		System.out.println("Wallet Balance :" + wallet.getBalance());

		// 2 problem
//		CloudStorageQuota store = new CloudStorageQuota(100, 60);
//
//		store.uploadFile(15);
//		System.out.println("Available Storage :" + store.getAvailableStorage() + "GB");
//
//		store.uploadFile(0);
//		System.out.println("Available Storage :" + store.getAvailableStorage() + "GB");
		
//		//3 problem
//		LoginAttemptGuard log = new LoginAttemptGuard();
//		
//		log.recordFailedLogin();
//		log.recordFailedLogin();
//		log.recordFailedLogin();
//		
//		System.out.println("Account Locked: " + log.isAccountLocked());
		
//		//4 problem
//		CheckoutCoupon coupon = new CheckoutCoupon(1000, 10);
//		
//		coupon.applyDiscount();
//		
//		System.out.println("Final amount :" + coupon.getFinalAmount());
		
		//5 problem 
//		PaymentTransaction payment = new PaymentTransaction(1000);
//		
//		payment.processPayment();
//		 System.out.println("Amount: ₹" + payment.getTransactionAmount());
//	     System.out.println("Status: " + payment.getTransactionStatus());
		
		//6 problem
		BankAccount bank = new BankAccount(1000, 9300);
		
		
		bank.doWithdraw(500, 9300);
		bank.doDeposit(5000, 9300);
		
		System.out.println("Remaining Balance :" + bank.getBalance(9300));
		
	     
	     
	}

}
