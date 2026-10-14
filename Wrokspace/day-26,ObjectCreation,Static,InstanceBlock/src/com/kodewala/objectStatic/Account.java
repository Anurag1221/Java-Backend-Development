package com.kodewala.objectStatic;

class AccountMgmt{
	
	public AccountMgmt(){
		System.out.println("AccountMgmt.AccountMgmt()....");
	}
}
public class Account extends  AccountMgmt{
	
	String accoutNumber;
	
	//Instance Init Block --> this will get executed  whenever object is created
	{
		System.out.println("Account.IIB ");
	}

	public Account(String accoutNumber) {
		super(); // 1st line
		// call to init Block --> IIB --> 2nd line
		System.out.println("Account(String accoutNumber)");
		this.accoutNumber = accoutNumber;
	}
		
}
