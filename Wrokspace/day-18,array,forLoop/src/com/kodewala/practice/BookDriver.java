package com.kodewala.practice;

public class BookDriver {

	public static void main(String[] args) {
		
		Book book1 = new Book("veko", 399);
		Book book2 = new Book("maths", 99);
		Book book3 = new Book("chemistry", 898);
		Book book4 = new Book("hindi", 885);
		
		Book book[] = new Book[4];
		
		book[0] = book1;
		book[1] = book2;
		book[2] = book3;
		book[3] = book4;
		
		for(int i=0; i < book.length; i++) {
			
			System.out.println(book[i].book);
			System.out.println(book[i].price);
			System.out.println();
		}
	}

}

