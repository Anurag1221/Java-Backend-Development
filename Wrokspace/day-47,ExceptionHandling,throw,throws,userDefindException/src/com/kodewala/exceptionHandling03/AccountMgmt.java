package com.kodewala.exceptionHandling03;

//throw :- create new exception object and throw it to the caller
//throws :- handle multiple exception
//checked,unchecked exception
public class AccountMgmt {
	
	public void openAccount(String accNo, String address) {
		
		System.out.println("AccountMgmt.openAccount() START");
		
		activateAccount("7646545763");
		System.out.println("AccountMgmt.openAccount() END");
	}
	
	private void activateAccount(String accNo) {
		
		System.out.println("AccountMgmt.activateAccount() START");
		
		try {
			checkAccountStatus(null);
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("AccountMgmt.activateAccount() END");
	}
	
	private boolean checkAccountStatus(String accNO) throws Exception{
		
		try {
			accNO.startsWith("SBI"); // NPE -- Risky code
			
		} 
		catch (Exception e) {
			
			//throw --> create new exception object and throw it to the caller
			throw new Exception("Account number is not statring with SBI");
		}
		return false;
	}
}
