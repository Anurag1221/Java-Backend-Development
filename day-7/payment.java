class Payment{
	
	int totalBalance = 2100; // instance variable -->belongs to the objects
	
	static int maxAmount = 10000; static variable --> // belongs to the class
	
	public static void main(String args[]){
	
		//created variable
		
		int balance; // local variable
		balance = 200;
		
		int amountToBeTxn = 10;// local variable
		
		System.out.println("Balance is : " + balance);
		System.out.println("Transaction amount : " + amountToBeTxn);
	}
	
	public void doSomeThing(){
		System.out.println("Max amount : " + maxAmount); // using static variable
	}
}