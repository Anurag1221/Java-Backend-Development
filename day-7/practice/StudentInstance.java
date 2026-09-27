class StudentInstance{
	
	//Instance Variable
	String name;
	int age;
	int marks;
	public static void main(String args[]){
		
		//Object Creation
		StudentInstance student = new StudentInstance();
		
		//Assign valus
		student.name = "Anurag";
		student.age = 24;
		student.marks = 85;
		
		//Print information
		System.out.println("Name : " + student.name);
		System.out.println("age : " + student.age);
		System.out.println("marks : " + student.marks);		
	}
}
