class FindPercan{

	public static void main(String args[]){
	
	int Hindi=77, English=88, Maths=67, Chemistry=68, Physics=78;
	int Total = (Hindi + English + Maths + Chemistry + Physics)/5;
	
	if(Hindi >= 33 &&  English>=33 && Maths>=33 && Chemistry>=33 && Physics>=33){
		System.out.println("Student is pass , Percentage is :" +Total);
	} else{
		System.out.println("Student is fail");
	} 
	
	}
}