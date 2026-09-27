class ExamResult {
	
	//library file connected with LibraryBook
	int rollNo;
	String studentName;
	int marks1;
	int marks2;
	int marks3;
	
	// Instance variables
    int totalMarks;
    double percentage;
	
	//default access modifire
	int calculateTotal(){
		
		totalMarks = marks1 + marks2 + marks3;	
		return totalMarks;
	}
	
	//default access modifire
	double calculatePercentage(){
		
		percentage = (marks1 + marks2 + marks3)/3.0;	
		return percentage;
		
	}
	
	//default access modifire
	void displayResult(){
		
		System.out.println("Roll No:" + rollNo);
		System.out.println("Student Name :" + studentName);
		System.out.println("Marks1 : " + marks1);
		System.out.println("Marks1 : " + marks2);
		System.out.println("Marks1 : " + marks3);
		System.out.println("totalMarks : " + totalMarks);
		System.out.println("percentage : " + percentage);
		
	}
	
}



