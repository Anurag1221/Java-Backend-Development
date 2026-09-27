 class Employee{
	
	public static void main(String args[]){
	
		//created variable
		
		
		int balance; // local variable
		balance = 200;
		
		//int amountToBeTxn = 10;// local variable
		
		System.out.println(doSomeThing(balance));
		//System.out.println("Transaction amount : " + amountToBeTxn);
	}
	
	static int doSomeThing(int balance){
		return balance;
	}
	
}