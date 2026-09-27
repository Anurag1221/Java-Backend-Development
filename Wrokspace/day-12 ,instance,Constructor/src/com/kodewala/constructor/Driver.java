package com.kodewala.constructor;

public class Driver {

	public static void main(String[] args) {
		
		AccountHolder user1 = new AccountHolder(20000, "637857322", "Anurag", "7247747479");
		
		AccountHolder user2 = new AccountHolder(34000, "786357322", "Arth", "6356347479");
		
		System.out.println(user1.amount);
		System.out.println(user1.account);
		System.out.println(user1.name);
		System.out.println(user1.phoneNumber);
		
		System.out.println(user2.amount);
		System.out.println(user2.account);
		System.out.println(user2.name);
		System.out.println(user2.phoneNumber);
		
		
		
		
	}

}
