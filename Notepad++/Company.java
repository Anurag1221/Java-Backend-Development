package Company;

class Company{
	
	String companyName;
	
	Company(String _companyName){
		this.companyName = _companyName;
	}
	
	void displayCompany(){
		System.out.println("Company Name :" + companyName);
	}
}
class Employee extends Company{
		
	int employeeId;
	String name;
	
	Employee(String _companyName, int _employeeId, String _name){
		super(_companyName);
		this.employeeId = _employeeId;
		this.name = _name;
	}
	
	void displayEmployee(){
		super.displayCompany();
		System.out.println("Employee Id :" + employeeId);
		System.out.println("Name :" + name);	
	}
	
}





//Class Work:
//✓ Create a Company class with a constructor that initializes the company name. Create an
//Employee class that inherits from Company and uses super() to initialize the company name
//and also stores employee details.
