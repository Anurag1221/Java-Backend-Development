package com.kodewala.practice;

import java.util.Scanner;

public class GitCommandSelector {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		GitCommandSelector git = new GitCommandSelector();

        System.out.println("Git command console");
        System.out.println("1 → Add Files");
        System.out.println("2 → Commit Changes");
        System.out.println("3 → Push Changes");
        System.out.println("4 → Pull Changes");
        System.out.println("5 → View Status");

        System.out.print("Enter command option: ");
        int option = sc.nextInt();

        git.displayCommand(option);

        sc.close();
    }

    public void displayCommand(int option) {

        if (option == 0) {
            System.out.println("ATM session terminated.");
            return;
        }

        switch (option) {

        case 1:
            System.out.println("Add Files in Staging area");
            break;

        case 2:
            System.out.println("Commit Changes - send message to remote directory with data");
            break;

        case 3:
            System.out.println("Push Changes - push data to remote directory");
            break;

        case 4:
            System.out.println("Pull Changes- Pulling latest changes...");
            break;
        case 5:
            System.out.println("View Status-view the current status of data");
            break;    

        default:
            System.out.println("Invalid command");
            break;
        }
    }

}

