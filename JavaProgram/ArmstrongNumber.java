import java.util.Scanner;;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // check given number is armstrong or not

        // System.out.println("Enter Number : ");
        // int n = obj.nextInt();
        // int num=n;
        // int sum = 0;
        // while (num != 0) {
        // int digit = num % 10;
        // sum = sum + digit * digit * digit;
        // num /= 10;

        // }
        // if (sum==n) {

        // System.out.println("Armstrong Number : "+sum);
        // }
        // else
        // {
        // System.out.println("It is not Armstrong Number");
        // }


        // list of armstrong number
        
        System.out.println("Enter Starting number ");
        int m = obj.nextInt();

        System.out.println("Enter Ending number ");
        int n = obj.nextInt();

        for (int i = m; i < n; i++) {
            int x=i;
            int num = x;
            int sum = 0;
            while (num != 0) {
                int digit = num % 10;
                sum = sum + digit * digit * digit;
                num /= 10;

            }
            if (sum == x) {

                System.out.print("\t"+sum);
            }

        }

        obj.close();
    }
}
