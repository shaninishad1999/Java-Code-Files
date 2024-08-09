import java.util.Scanner;

public class UglyNumber {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // check number is ugly or not

        System.out.println("Enter Number");
        int n = obj.nextInt();

        if (n % 2 == 0) {
            n /= 2;

        }  if (n % 3 == 0) {
            n /= 3;
        }  if (n % 5 == 0) {
            n /= 5;
        }

        if (n == 1) {
            System.out.println("ugly number");

        } else {
            System.out.println("not ugly");
        }

        obj.close();

    }
}
