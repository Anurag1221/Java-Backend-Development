package com.kodewala.practice;

public class Book {
	
	int bookId;
	String bookName;
	String author;
	int price;
		
	Book(int _bookId, String _bookName,String _author,int _price){
		 
		bookId = _bookId;
		bookName = _bookName;
		author = _author;
		price = _price;
	}
	
	void displayDetails() {
		System.out.println("bookId :" + bookId);
		System.out.println("bookName :" + bookName);
		System.out.println("author :" + author);
		System.out.println("price :" + price);
		System.out.println();
	}
}

/*
 * 4. Book Create a Book class with:
 * int bookId;
	String bookName;
	int author;
	int price;
 *
 * Create 2 book objects and display all information.
 */