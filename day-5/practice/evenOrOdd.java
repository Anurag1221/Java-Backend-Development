class EvenOdd{
	
	public static void main(String args[]){
		
		int firstNo = Integer.parseInt(args[0]);
		
		if(firstNo % 2 == 0){
			System.out.println(firstNo + " is even");
		} else {
			System.out.println(firstNo + " is odd");
		}
	}
}