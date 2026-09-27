class BankAccountInstance{
	
	//Instance Variable
	int balance=1000;
	public static void main(String args[]){
		
		//1 Object Creation
		BankAccountInstance acc1 = new BankAccountInstance();
		
		//Old balance
		System.out.println("Object 1 : " + acc1.balance);
		
		//Assign valus
		acc1.balance = 4000;
		
		//updeted balance
		System.out.println("Object 1 Updeted balance : " + acc1.balance);	

		//2 Object Creation
		BankAccountInstance acc2 = new BankAccountInstance();
		
		System.out.println("Object 2 : " + acc2.balance);
	}
}
