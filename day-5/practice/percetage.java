class StudentResult {

    public static void main(String args[]) {

		String studentName = args[0];
        double English = Double.parseDouble(args[1]);
        double Hindi = Double.parseDouble(args[2]);
        double Physics = Double.parseDouble(args[3]);
        double Chemistry = Double.parseDouble(args[4]);
        double Maths = Double.parseDouble(args[5]);
        double totalMarks = English + Hindi + Physics + Chemistry + Maths;
		double Percentage = (English + Hindi + Physics + Chemistry + Maths)/5;
		
		System.out.println("English Marks : " + English);
        System.out.println("Hindi Marks : " + Hindi);
		System.out.println("Physics Marks : " + Physics);
        System.out.println("Chemistry Marks: " + Chemistry);
		System.out.println("Maths Marks : " + Maths);
        System.out.println("Total Marks : " + totalMarks);
        System.out.println("Percentage : " + Percentage);
		
		if(Percentage >= 60){
			System.out.println("Grade : A");
		} else{
			System.out.println("Grade : B");
		}
		
		if(Percentage >= 33){
			System.out.println("Pass :" + Percentage);
		} else{
			System.out.println("Fail :" +  + Percentage);
		}
        
    }
}


