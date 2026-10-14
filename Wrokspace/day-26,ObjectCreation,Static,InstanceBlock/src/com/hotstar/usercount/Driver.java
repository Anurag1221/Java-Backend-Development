package com.hotstar.usercount;

public class Driver {

	public static void main(String[] args) {

		for (int i = 0; i < 20000; i++) {

			User user = new User("HS", "HotStar", "Paid");
		}

		for (int i = 0; i < 6000; i++) {

			User user = new User("Guest", "Free");
		}

		System.out.println("Total live users are :" + User.liveUserCount);
		
	}

}
