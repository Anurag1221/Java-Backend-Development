class Employee {

	public int employeeId;
	public String employeeName;
	public String department;
	public int salary;
		
	public int calculateAnnualSalary(){
		return salary*12;
	}
	
	public void displayEmployee(){
		
		System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Department: " + department);
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Annual Salary: " + calculateAnnualSalary());
	}
}



class EmployeeTest{
	
	public static void main(String args[]) {
		
	Employee emp1 = new Employee();
	Employee emp2 = new Employee();
	Employee emp3 = new Employee();
	
	emp1.employeeId = 102;
	emp1.employeeName = "Rahul";
	emp1.department = "HR";
	emp1.salary = 35000;
	
	emp2.employeeId = 101;
	emp2.employeeName = "Anurag";
	emp2.department = "IT";
	emp2.salary = 30000;
	
	emp3.employeeId = 103;
	emp3.employeeName = "amit";
	emp3.department = "Finance";
	emp3.salary = 40000;
	
	emp1.displayEmployee();
	emp2.displayEmployee();
	emp3.displayEmployee();
	
	}
}

