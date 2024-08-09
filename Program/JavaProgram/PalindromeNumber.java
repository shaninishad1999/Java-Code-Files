import java.util.Scanner;;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // reverse number of given number

        // System.out.print("Enter Number : ");
        // int n = obj.nextInt();

        // int sum = 0;
        // while (n != 0) {
        // int digit = n % 10;
        // sum = (sum * 10) + digit;
        // n /= 10;

        // }
        // System.out.print("Polindrome or Reverse Number : " + sum);

        System.out.println("Enter Starting Number:");
        int m = obj.nextInt();
        System.out.println("Enter Ending Number:");
        int n = obj.nextInt();

        obj.close();

        for (int i = m; i <= n; i++) {
            int num = i;
            int reversedNum = 0;
            int originalNum = num; // Store original number to compare later

            while (num != 0) {
                int digit = num % 10;
                reversedNum = (reversedNum * 10) + digit;
                num /= 10;
            }

            if (originalNum == reversedNum) {
                System.out.print("\t"+originalNum);
            }
        }
    }
}
