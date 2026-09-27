class Account{
	
	int Balance = 100; // instance variable -->belongs to the objects , if i want to update data, like bank balance ,so all account having differnet different object of bank balance. 
	
	static int intRate = 5; //static variable --> // belongs to the class // i want don't want to change the variable value so use static variable. like bank account interest ,all customer having same interest rate ,so do not need all bank account holder different different variable data.
	
	public static void main(String args[]){
	
		//created variable
		Account acc = new Account();
		
		System.out.println("Balance is : " + acc.Balance); //dot(.) opereator
		System.out.println("Transaction amount : " + Account.intRate);//dot(.) opereator
		
		Account.doSomeThing(); // static method and calling doSomething
		acc.doNoThing(); // instance method and calling doNoThing
		
	}
	
	public static void doSomeThing(){
	
		System.out.println("This is do something methos...");
	}
	
	public void doNoThing(){
	
		System.out.println("This is do Nothing methos...");
	}
	
}