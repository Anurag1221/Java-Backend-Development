package com.kodewala.practice.dowhile;

import java.util.Scanner;

public class LogFileScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("pls enter the status code");
			int code = sc.nextInt();
			
			if (code == -1) {
				System.out.println("Log scanning stopped");
				break;
			}
			
			if(code == 200) {
				System.err.println("Success Request");
				break;
			}
			else if (code == 400){
				System.err.println(" Bad Request");
			
			}
			else if (code == 404){
				System.err.println("Not Found");
			}
			else if (code == 500){
				System.err.println("Server Error");
			}
			else {
				System.out.println("Invalid Code");
				System.out.println();
				continue;
			}
			
		}while(true);
		
	sc.close();

	}

}
