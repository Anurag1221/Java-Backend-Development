class ArgumentCheck {

    public static void main(String args[]) {

        if (args.length == 0) {
            System.out.println("Please enter the input");
        } else {
            System.out.println("Arguments received: " + args.length);
        }

    }
}