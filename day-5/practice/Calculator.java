class Calculator{
	
	public static void main(String args[]){
		
		int firstNo = Integer.parseInt(args[0]);
		String operetor = args[1];
		int secondNo = Integer.parseInt(args[2]);
		
		if(operetor.equals("+")){
			System.out.println("Plus is :" + (firstNo+secondNo));
	
		} else if (operetor.equals("-")){
			System.out.println("Subcration is :" + (firstNo-secondNo));
			
		}else if (operetor.equals("*")){
			System.out.println("Multiplication :" + (firstNo*secondNo));
			
		}
		else{
			System.out.println("Divide is:" + (firstNo/secondNo));
		}
	}
}