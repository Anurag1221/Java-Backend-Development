class Result{
	
	public static void main(String args[]){
		
		ExamResult ExRe = new ExamResult();
		
		ExRe.rollNo = 101;
		ExRe.studentName = "Arth";
		ExRe.marks1 = 90;
		ExRe.marks2 = 100;
		ExRe.marks3 = 85;
		
		ExRe.calculateTotal();
		ExRe.calculatePercentage();
		ExRe.displayResult();
		
	}
}



