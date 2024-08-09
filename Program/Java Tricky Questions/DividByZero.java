public class DividByZero {
    public static void main(String[] args) {
        // System.out.println(9/0); //ArithmeticException:
        System.out.println(9.0f/0);  //infinity
        System.out.println(9.0999999999d/0);  //infinity
        System.out.println(10/0.0);  //infinity
        // System.out.println(0/0);  //ArithmeticException:
        System.out.println(0.0/0);  //Nan
  




    }
}
