package com.problem.sample;

public class StudentObject {
	
	int studentId;
	String studentName;
	static int studentCount=0;
	
	StudentObject() {
	    studentCount++;
	}
	
	public static void main(String[] args) {
		StudentObject Stud1 = new StudentObject();
		StudentObject Stud2 = new StudentObject();
		StudentObject Stud3 = new StudentObject();
		
		Stud1.studentId=101;
		Stud1.studentName="Anurag";
		
		Stud2.studentId=102;
		Stud2.studentName="Arth";
		
		Stud3.studentId=103;
		Stud3.studentName="Ashay";
		
		System.out.println("student Id1" + Stud1.studentId);
		System.out.println("student Id2" + Stud2.studentId);
		System.out.println("student Id3" + Stud3.studentId);
		System.out.println("student Name1" + Stud1.studentName);
		System.out.println("student Name2" + Stud2.studentName);
		System.out.println("student Name2" + Stud3.studentName);
		System.out.println("Objects" + StudentObject.studentCount) ;
		
	}

}
