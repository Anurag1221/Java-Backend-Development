//Write a program to determine if a number is divisible by both 3 and 5 using logical and
//relational operators.

class DivisibleByNo {

    public static void main(String args[]) {

        int num1 = Integer.parseInt(args[0]);

        if (num1 % 3 == 0 && num1 % 5 == 0) {

            System.out.println("Number is divisible by both 3 and 5");

        } else {

            System.out.println("Number is not divisible by both 3 and 5");
        }
    }
}
