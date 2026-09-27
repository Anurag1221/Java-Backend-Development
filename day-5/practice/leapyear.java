class LeapYear{
	
	public static void main(String args[]){
		
		int firstNo = Integer.parseInt(args[0]);
		
		if(firstNo % 400 == 0 || firstNo % 4 == 0 && firstNo % 100 != 0){
			System.out.println("Leap year :" + firstNo);
		}else {
			System.out.println("Not a leap year :" + firstNo);
		}	
		
	}
}