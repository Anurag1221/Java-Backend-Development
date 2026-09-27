class MobilePhone {
	
	//library file connected with LibraryBook
	private String brand;
	private double price;
	private int batteryPercentage;
	
	//default accessi modifire
	private void phoneStatus(){
		
		System.out.println("brand" + brand);
		System.out.println("price" + price);
		System.out.println("Battery Percentage" + batteryPercentage);
		
	}
	
	public void setPhoneDetails(String b, double p, int battery) {

        brand = b;
        price = p;
        batteryPercentage = battery;
    }

	
	public void displayPhone(){
	
		phoneStatus();
		
	}
}

class PhoneTest{
	
	public static void main(String args[]){
		
		MobilePhone MoPo = new MobilePhone();
		
		MoPo.setPhoneDetails("iPhone", 185000, 87); 
		
		MoPo.displayPhone();
		
	}
}







