class EmployeeSalary {

    public static void main(String args[]) {

        String employeeId = args[0];
        String name = args[1];
        double basicSalary = Double.parseDouble(args[2]);
        double hra = Double.parseDouble(args[3]);
        double bonus = Double.parseDouble(args[4]);
        double totalSalary = basicSalary + hra + bonus;

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }
}