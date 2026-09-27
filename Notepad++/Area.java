class Area {

    public int areaOfRectangle(int length, int width) {
		return length*width;
    }

    public static void main(String args[]) {

        Area area = new Area();

        int ar = area.areaOfRectangle(100,50);
		
		System.out.println("Area of rectangle :" + ar);
		
    }
}
//✓ Write a program that calls a method to compute the area of a rectangle. The method 
//should take  and width as parameters and return the area.



