package com.kodewala.oops.inheritance;

class Account{
	
	public void openAcoount(String userId, String email) {
		
		System.out.println("Account.openAcoount()");
	}
}

class SavingAccount extends Account{
	
	public void openAcoount(String userId, String email) {
		
		System.out.println("SavingAccount.openAcoount()");
	}
}

class SrCitAccount extends SavingAccount{
	
	public void openAcoount(String userId, String email) {
		
		System.out.println("SrCitAccount.openAcoount()");
	}
}

class PensionAccount extends SrCitAccount{
	
	public void openAcoount(String userId, String email) {
		
		System.out.println("PensionAccount.openAcoount()");
	}
}

public class Driver {

	public static void main(String[] args) {
		
		PensionAccount account = new PensionAccount();

	}

}
