public class NotANumber {
    public static void main(String[] args) {
        // System.out.println(2/0); //ArithmeticException:

        // System.out.println(2.0/0); //infinity

        // System.out.println(2/0.0); //infinity

        // System.out.println(2.0/0.0); //infinity
        // System.out.println(0.0/0.0); //Not a number(NaN)

        // System.out.println(Math.sqrt(-1)); ////Not a number(NaN)
        // System.out.println(Float.NaN==Float.NaN); // false
        // System.out.println(Float.NaN!=Float.NaN); // true

        double nan = 2.1 % 0; // NaN
        System.out.println(2.1 % 0 == nan); // false
        System.out.println(nan == nan); // false

    }

}
