public class DoubleMinValue {
    public static void main(String[] args) {
        /*
         * what is the value of double MIN_VALUE?
         * Which one is bigger-->Doble MIN_VALUE or 0.0d?
         * Which one is bigger-->Doble MIN_VALUE or NEGATIVE_INFINITY?
         */
        System.out.println(Double.MIN_VALUE);  //4.9E-324  positive number

        System.out.println(Long.MIN_VALUE);  //-9223372036854775808 Negative number
        
        System.out.println(Integer.MIN_VALUE);  //-2147483648 Negative number

        System.out.println(Math.min(Double.MIN_VALUE,0.0d));  //0.0d>0.0 it is positive number
        System.out.println(Math.min(Float.MIN_VALUE,0.0f));  //0.0 it is positive number
        System.out.println(Math.min(Integer.MIN_VALUE,0.0));  //-2.147483648E9 it is Negative number
        System.out.println(Math.min(Long.MIN_VALUE,0.0));  //-9.223372036854776E18 it is negative number


        System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY));  //-Infinity
    }
}
