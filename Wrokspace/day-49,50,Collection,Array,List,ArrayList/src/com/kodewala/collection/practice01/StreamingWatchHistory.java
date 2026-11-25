package com.kodewala.collection.practice01;

import java.util.ArrayList;

public class StreamingWatchHistory {

	public static void main(String[] args) {
		
		ArrayList<String> movieName = new ArrayList<String>();
		movieName.add("Dhurandar");
		movieName.add("Ramayan");
		movieName.add("Rockstar");
		movieName.add("animal");
		movieName.add("Kgf");
		movieName.add("3 idiots");
		movieName.add("Ramayan");
		
		System.out.println(movieName.contains("Ramayan"));
		System.out.println(movieName.get(2));
		System.out.println(movieName.size());
		
		
		
	}

}
