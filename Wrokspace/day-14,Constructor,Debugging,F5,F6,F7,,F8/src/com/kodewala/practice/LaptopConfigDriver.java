package com.kodewala.practice;

public class LaptopConfigDriver {

	public static void main(String[] args) {
		LaptopConfig lap = new LaptopConfig();
		LaptopConfig lap2 = new LaptopConfig("Dell Inspiron", "Dell");
        LaptopConfig lap3 = new LaptopConfig("ThinkPad", "Lenovo", 16);
		
		lap.displayDetails();
		lap2.displayDetails();
		lap3.displayDetails();

	}

}
