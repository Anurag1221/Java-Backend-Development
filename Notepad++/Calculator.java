class Calculator {

    public int addition(int num1, int num2) {
        return num1 + num2;
    }

    public int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public int division(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String args[]) {

        int num1 = Integer.parseInt(args[0]);

        String operator = args[1];

        int num2 = Integer.parseInt(args[2]);

        Calculator calculator = new Calculator();

        if (operator.equals("+")) {
            System.out.println("Addition: " + calculator.addition(num1, num2));

        } else if (operator.equals("-")) {
            System.out.println("Subtraction: " + calculator.subtraction(num1, num2));

        } else if (operator.equals("*")) {
            System.out.println("Multiplication: " + calculator.multiplication(num1, num2));

        } else if (operator.equals("/")) {
            System.out.println("Division: " + calculator.division(num1, num2));

        } else {
            System.out.println("Invalid operator");
        }
    }
}