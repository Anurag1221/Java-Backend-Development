class DefaultValue {
	//Write a program to explore the non-primitive data types default value.
    String name;
    int[] numbers;

    public static void main(String args[]) {

        DefaultValue obj = new DefaultValue();

        System.out.println("String default value: " + obj.name);
        System.out.println("Array default value: " + obj.numbers);
    }
}