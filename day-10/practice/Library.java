class Library{
	
	//default accessi modifire
	public static void main(String args[]) {
		
		LibraryBook licBook = new LibraryBook();
		
		licBook.bookId = 101;
		licBook.title = "Java Programing";
		licBook.price = 600.0;
		
		licBook.showBook();
	}
}