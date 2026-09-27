class BankAccount {

	public long accountNumber;
	public String holderName;
	public double balance;
	
	public void deposit(double amount){
		
		System.out.println("Account Number" + accountNumber);
		System.out.println("Holder Name" + holderName);
		System.out.println("Balance" + balance);
		System.out.println("Amount" + amount);
		
	}
}

class AccountDetails{
	
	public static void main(String args[]) {
		
		BankAccount acc = new BankAccount();
		
		acc.accountNumber = 7678362;
		acc.holderName = "Anurag";
		acc.balance = 60000;
		
		acc.deposit(10000);
	}
}

