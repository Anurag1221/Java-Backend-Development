class AddTwoNo {

    public static void main(String args[]){
		
		
		//taking command line argument
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
		
		System.out.println("Num1 :" +num1);
		System.out.println("Num2 :" +num2);

		//calling method
        AddTwoNo.SumNo(num1,num2);
		
    }

    static int SumNo(int num1, int num2){

        System.out.println("Sum : "+ (num1+num2));

        return 0;
    }
}