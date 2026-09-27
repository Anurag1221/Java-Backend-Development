class AccountInstance{
	
	//Instance Variable
	int balance;
	public static void main(String args[]){
		
		//2 Object Creation
		AccountInstance acc1 = new AccountInstance();
		AccountInstance acc2 = new AccountInstance();
		
		//Assign valus
		acc1.balance = 24000;
		acc2.balance = 25000;
		
		//Print balance
		System.out.println("Object 1 : " + acc1.balance);
		System.out.println("Object 2 : " + acc2.balance);		
	}
}
