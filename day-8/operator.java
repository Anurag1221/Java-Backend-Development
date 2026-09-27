class Operators{
	
	public static void main(String args[]){
	
		
		int minAge = 18; // assingnment operetor
		int maxAge = 60;
		
		int userAge = Integer.parseInt(args[1]);// local variable
		String name = args[0];
		
		System.out.println("Applying DL For :" + name);
		
		System.out.println("Condition1 :" + (minAge<userAge));
		System.out.println("Condition2 :" + (maxAge>userAge));
		
		System.out.println("Allowened to apply for DL : " + ( (minAge<userAge) && (maxAge<userAge) ) );// true
		
		String message = minAge < userAge ? "Allowed" : "Not Allowed";
		System.out.println(message);
	}
	
}