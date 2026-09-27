//3].Write a program to use the instance and static variable and display the details. 
//Instance variable can be employee detail like name, age, and department. 
//Use company code as a static variable. Display the details in the console.
class  EmployeeDetails{

    // Instance variable
    String name = "Anurag";
	int age = 24;
	String department = "CS";

    // Static variable with same name
    static int companyCode = 90056;

    public static void main(String[] args) {

		//object creation
        EmployeeDetails emp = new EmployeeDetails();

		//print instance
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
		System.out.println("Department: " + emp.department);
		
		System.out.println("Company Code: " + EmployeeDetails.companyCode);
    }
}