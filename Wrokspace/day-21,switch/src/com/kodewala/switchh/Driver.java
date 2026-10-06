package com.kodewala.switchh;

public class Driver {

	public static void main(String[] args) {
		
		Driver driver  = new Driver();
		
		int day = Integer.parseInt(args[0]);
		
		driver.identifyDay(day);

	}
	
	public void identifyDay(int number) {
		
		switch (number) {
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("TH");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SATUR");
			break;
		case 7:
			System.out.println("SON");
			break;	
		default:
			System.out.println("input not valid");
			break;
		}
	}

}
