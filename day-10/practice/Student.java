class Student {

	public String name;
	public int age;
	public double marks;
	public int salary;
	
	public void displayStudent(){
		
		System.out.println("Name" + name);
		System.out.println("Age" + age);
		System.out.println("Marks" + marks);
		System.out.println("Saraly" + salary);
	}
}

class StudentDetail{
	
	public static void main(String args[]) {
		
		Student s1 = new Student();
		
		s1.name = "Anurag";
		s1.age = 24;
		s1.marks = 79;
		s1.salary = 27000;
		
		s1.displayStudent();
	}
}

