package com.kodewala.marker.Interface;

public class Driver {

	public static void main(String[] args) {
		
		User user = new User("Anu1221", "2566945");
		
		DataCleaner cleaner = new DataCleaner();
		cleaner.clean(user);

	}

}
