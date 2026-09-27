package com.problem.sample;

public class StudentData {

	public static void main(String[] args) {
		String studentName = "Anurag";
		String collegeName = "TIT";
		int marks[] = {86,55,66,77,87};
		int totalMarks = 0;
		
		for (int i = 0; i < marks.length; i++) {
			
				totalMarks += marks[i];
		}
		
		double average = totalMarks / marks.length;
		
		System.out.println("Student Name :" + studentName);
		System.out.println("College Name :" + collegeName);
		System.out.println("Total Marks ;" + totalMarks);
		System.out.println("Average :" + average);
		
		
	}

}
