import java.util.Scanner;
public class QuotientRemainder {
    public static void main(String args[])
    {
       Scanner obj=new Scanner(System.in);
        int divisor,dividend,quotient,remainder=0;
        System.err.print("Enter Dividend : ");
        dividend=obj.nextInt();
        System.out.print("Enter Divisor : ");
        divisor=obj.nextInt();
        quotient=dividend/divisor;
        remainder=dividend%divisor;
        System.out.println("Dividend : "+quotient);
        System.out.print("Divisor : "+remainder);

        obj.close();
    }
}