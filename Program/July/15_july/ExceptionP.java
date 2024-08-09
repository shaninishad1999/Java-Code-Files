class ExceptionP {

    public static void main(String args[]) {

        int a = 10;
        int b = 5;
        double c = 0;

        System.out.println("Before Exception");
        try {
            c = 0/ 0;
            System.out.println("This is try block");
        } catch (ArithmeticException e) {
            System.out.println("This is exception block");
        }

        System.out.println("Result = " + c);
    }
}
