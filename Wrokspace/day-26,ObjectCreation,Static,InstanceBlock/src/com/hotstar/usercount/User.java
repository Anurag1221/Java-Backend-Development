package com.hotstar.usercount;

public class User {
	
	String userID;
	String userName;
	String type;
	public static int liveUserCount = 0;
	
	public User(String userID, String userName, String type) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.type = type;
	}

	public User(String userName, String type) {
		super();
		this.userName = userName;
		this.type = type;
	}
	
	//instance init block
	{
		liveUserCount = liveUserCount + 1;
	}
	
	
}
