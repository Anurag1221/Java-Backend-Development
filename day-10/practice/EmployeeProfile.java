class EmployeeProfile {
	
	//library file connected with EmployeeProfile
	private int id;
	private String name;
	private double salary;
	
	//Setter method
	public void setId(int id1){
		id = id1;
	}
	
	public void setName(String name1){
		name = name1;
	}
	
	public void setSalary(double salary1){
		salary= salary1;
	}
	
	//getter method
	public int getId(){
		return id;
	}
	
	public String getName(){
			return name;
	}
	
	public double getSalary(){
		return salary;
	}
}

class Employe{
	
	public static void main(String args[]){
		
		EmployeeProfile EmpPro = new EmployeeProfile();
		
		//set values
		EmpPro.setId(101);
        EmpPro.setName("Anurag");
        EmpPro.setSalary(27000);
		
		//get values
		System.out.println("ID" + EmpPro.getId());
		System.out.println("Name" + EmpPro.getName());
		System.out.println("Salary" + EmpPro.getSalary());
			
	}
}







