
import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // check even number of give number

        // System.out.println("Enter Any Number");
        // int num=obj.nextInt();
        // if (num%2==0) {
        // System.out.println("It is Even Number ");

        // }
        // else
        // {
        // System.out.println("It is not Odd Number ");
        // }

        // print even  or odd number given stating and ending number
        System.out.println("Enter Starting Number ");
        int m = obj.nextInt();
        System.out.println("Enter Ending number ");
        int n = obj.nextInt();
        System.out.println("Even Number ");
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print("\t" + i);
            }
            // if (i % 2 != 0) {
            //     System.out.print("\t" + i);
            // }
        }

        obj.close();
    }
}
