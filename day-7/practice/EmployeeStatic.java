class EmployeeStatic{
	
	//Static Variable
	static String companyName = "ABC Pvt Ltd";
	
	public static void main(String args[]){
		
		//Creation of 2 objects
		EmployeeStatic employee1 = new EmployeeStatic();
		EmployeeStatic employee2 = new EmployeeStatic();
		
		//print the company Name
		System.out.println("Company Name: " + employee1.companyName);
		System.out.println("Company Name: " + employee2.companyName);
		
		//change the company name
		employee1.companyName ="XYZ Pvt Ltd";
		employee2.companyName ="XYZ Pvt Ltd";
		
		//updeted the company name
		System.out.println("Updeted Company Name: " + employee1.companyName);
		System.out.println("Updeted Company Name: " + employee2.companyName);
	}
	
}
