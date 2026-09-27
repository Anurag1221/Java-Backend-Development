class FundTransfer{
	
	public static void main(String args[]){
		
		System.out.println("Starting main()");
		
		//Calling the method and passing the value(input)
		boolean result = FundTransfer.doTransaction(10, "676476746" , "784676465");
		
		System.out.println("Is txn successful ?" + result);
		
		System.out.println("Ending main()");
	}
	
	
	static boolean doTransaction(int amountToBetxn, String senderAccNo, String recAccNo){
		
		System.out.println("Entered doTransaction()");
		
		System.out.println("Input Received" + amountToBetxn+" "+senderAccNo +" "+ recAccNo);
		//somebiz logic which will perform the transaction.
		
		System.out.println("Exit doTransaction()");
		
		return true;
		
	}
	
	
	
}