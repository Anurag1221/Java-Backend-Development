package com.kodewala.practice.dowhile;

import java.util.Scanner;

public class ServerHealthConsole {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int validReports  = 0;
		
		do{
			System.out.println("Enter server health status:");
			int code = sc.nextInt();
			
			if (code == 0) {
				System.out.println("Stop Monitoring");
				break;
			}
			
			validReports++;
			if(code == 1) {
				System.err.println("Server Healthy");
			}
			else if (code == 2){
				System.err.println("High CPU Usage");
			}
			else if (code == 3){
				System.err.println("High Memory Usage");
			}
			else if (code == 4){
				System.err.println("Alert: Server Unreachable");
			}
			else if (code == 5){
				System.err.println("Maintenance Required");
			}
			else {
				System.out.println("Invalid code");
				continue;
			}
			
		}while(true);
		
		System.out.println("Total valid reports: " + validReports);
		
	sc.close();	

	}

}
