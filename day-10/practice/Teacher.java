class SchoolPerson {

    protected String name;
    protected int age;
}


class Teacher extends SchoolPerson {

    void setTeacherDetails() {

        name = "Anurag";
        age = 24;
    }

    void displayTeacher() {

        System.out.println("Teacher Name: " + name);
        System.out.println("Teacher Age: " + age);
    }
}


class TeacherTest {

    public static void main(String args[]) {

        Teacher teacher = new Teacher();

        teacher.setTeacherDetails();

        teacher.displayTeacher();
    }
}