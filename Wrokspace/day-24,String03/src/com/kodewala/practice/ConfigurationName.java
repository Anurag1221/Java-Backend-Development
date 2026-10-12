package com.kodewala.practice;

public class ConfigurationName {

	public static void main(String[] args) {
		
		String config1 = new String("redis.cache");
		String config2 = "redis.cache";

		System.out.println(config1 == config2); // false ,both object reference different
		System.out.println(config1.intern() == config2);// true // inter method use to move heap string object to scp 
														// config1 move into scp
														// so both object reference are same 

	}

}
