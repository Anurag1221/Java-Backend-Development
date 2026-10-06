package com.kodewala.practice;

import java.util.Scanner;

public class ServerMaintenanceConsole {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("\n--- Server Maintenance Console ---");
		System.out.println("1 → Restart Server");
		System.out.println("2 → Clear Cache");
		System.out.println("3 → Check CPU Usage");
		System.out.println("4 → Check Memory Usage");
		System.out.println("5 → Generate Diagnostic Report");
		System.out.println("9 → Emergency Shutdown");
		System.out.println("0 → Exit Console");

		do{

			System.out.print("Enter operation no.: ");
			int option = sc.nextInt();

			if (option == 0) {
				System.out.println("Exit Console");
				break;
			}
			
			if (option == 9) {
				System.out.println("Emergency Shutdown");
				break;
			}

			switch (option) {

			case 1:
				System.out.println("Restart Server");
				break;

			case 2:
				System.out.println("Clear Cache");
				break;

			case 3:
				System.out.println("Check CPU Usage");
				break;

			case 4:
				System.out.println("Check Memory Usage");
				break;
			case 5:
				System.out.println("Generate Diagnostic Report");
				break;	
			default:
				System.out.println("Unknown command");
				continue;
			}

		} while(true);
		System.out.println("Server maintenance console closed.");
		
		sc.close();
	}

}
