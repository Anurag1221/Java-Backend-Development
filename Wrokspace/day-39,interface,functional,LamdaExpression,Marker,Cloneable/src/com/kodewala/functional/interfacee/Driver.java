package com.kodewala.functional.interfacee;

public class Driver {
	
	public static void main(String[] args) {
		
		IAccount account = (name, address, balance) -> 
		{
			System.out.println("Opening Account");
			System.out.println("Name: "+ name);
			System.out.println("address: "+ address);
			System.out.println("balance: "+ balance);
			
			return "Account Opened";
		};
		
		String result = account.openAccount("Kodewala", "BTM bangalore", 1000);
		
		System.out.println(result);
	}
}
