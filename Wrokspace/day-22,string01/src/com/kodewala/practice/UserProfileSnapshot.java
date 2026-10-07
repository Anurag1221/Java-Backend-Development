package com.kodewala.practice;

public class UserProfileSnapshot {

	public static void main(String[] args) {
		
		String userName = "Anurag";
		String originalName = userName; // userName data store in another String 
		
		userName = userName.concat(" Ramtekkar"); // concat the data in userName
		
		System.out.println(userName); // thats print concat data (Anurag Ramtekkar)
		System.out.println(originalName); // thats print previous data of userName(Anurag)

	}

}
