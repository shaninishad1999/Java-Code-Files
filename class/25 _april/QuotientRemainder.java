import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String args[]) {
        float dividend, remainder, divisor, quotient;
// int divisor;
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter Divident : ");
        dividend = obj.nextFloat();
        System.out.print("Enter Divisor : ");
        divisor = obj.nextFloat();

        quotient = dividend / divisor;
        remainder = dividend % divisor;

        System.out.print("Quotient : " + quotient);
        System.out.print("\nRemainder : " + remainder);
        obj.close();
    }
}
