//2].How would you use static variables to count the total number of objects created for
//a class?
class CountObjec{
	
	//instance variable
	int accBalance;
	
	//static variable
	static int count = 0;
	
	//Constructor
	CountObjec(){
		count++;
	}
	
    public static void main(String args[]){
		
		//object creation
	 	CountObjec account1 = new CountObjec();
		CountObjec account2 = new CountObjec();
		CountObjec account3 = new CountObjec();
		
		//assignning value in instance variable
		account1.accBalance=10000;
		account2.accBalance=20000;
		account3.accBalance=30000;
		
		
		//insiance variable details print 
		System.out.println("Account Balance 1 :" + account1.accBalance);
		System.out.println("Account Balance 2 :" + account2.accBalance);
		System.out.println("Account Balance 3 :" + account3.accBalance);
		
		
		//static variable details print
		System.out.println("Total objects created: :" + CountObjec.count);
		
    }

}