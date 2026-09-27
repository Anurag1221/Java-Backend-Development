//3].What happens if an instance variable and static variable have the same name in a
//class?

class Student {

    // Instance variable
    int marks = 80;

    // Static variable with same name
    static int marks = 90;

    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println("Instance marks: " + s1.marks);
        System.out.println("Static marks: " + Student.marks);
    }
}