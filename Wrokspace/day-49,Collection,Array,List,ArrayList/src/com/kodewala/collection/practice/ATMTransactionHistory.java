package com.kodewala.collection.practice;

import java.util.ArrayList;

//indexOf() :- indexOf method use find index number of arraylist
//isEmpty() :- isEmpty method use to check arraylist emply or not
//clear() :- clear() method use to delete all the data into arraylist
public class ATMTransactionHistory {

	public static void main(String[] args) {
		
		ArrayList<String> transaction = new ArrayList<String>();
		
		transaction.add("ATM-TXN-502");
		transaction.add("ATM-TXN-503");
		transaction.add("ATM-TXN-504");
		
		//check the index number
		System.out.println(transaction.indexOf("ATM-TXN-503"));
		
		//check array list empty or not
		System.out.println(transaction.isEmpty());
		
		//clear all data to arraylist
		transaction.clear();
		
		//add the data into array list
		transaction.add("ATM-TXN-501");
		System.out.println(transaction);
		

	}

}
