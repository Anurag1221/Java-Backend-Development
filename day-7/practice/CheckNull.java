class CheckNull {

	//Write a program to check if the non-primitive data type has null value or not.Kode
    String name;

    public static void main(String args[]) {

        CheckNull obj = new CheckNull();

        if (obj.name == null) {
            System.out.println("Name has null value");
        } else {
            System.out.println("Name does not have null value");
        }
    }
}