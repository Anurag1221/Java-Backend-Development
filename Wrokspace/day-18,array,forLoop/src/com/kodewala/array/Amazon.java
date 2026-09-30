package com.kodewala.array;

public class Amazon {

	public static void main(String[] args) {
		
		AmazonDriver user1 = new AmazonDriver("Iphone", "6737663637");
		AmazonDriver user2 = new AmazonDriver("vivo", "8737863777");
		AmazonDriver user3 = new AmazonDriver("oppo", "7378673667");
		AmazonDriver user4 = new AmazonDriver("realme", "636767625");
		AmazonDriver user5 = new AmazonDriver("poco", "7638636736");
		
		AmazonDriver users[] = new AmazonDriver[5];
		
		users[0] = user1;
		users[1] = user2;
		users[2] = user3;
		users[3] = user4;
		users[4] = user5;

	}

}
