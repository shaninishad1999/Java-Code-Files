import java.util.Scanner;

class T {
    public static void main(String args[]) {
        int n, i, sum = 0, s = 0, d = 0, p = 0;
        Scanner shani = new Scanner(System.in);
        System.out.printf("Enter Number : ");
        n = shani.nextInt();  //  666
        
        // Calculate the sum of factors of n
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                s = s + i;
                System.out.print(" " + i + " \t ");
            }
        }
        System.out.println("\nSum of Factors of " + n + " are : " + s);
        
        int originalNumber = n; 

        // Calculate the sum of digits of n
        while (n != 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        System.out.println("Sum of digits : " + sum);
        
        int temp = sum;

        // Calculate the sum of digits of the sum of digits
        while (temp != 0) {
            d = temp % 10;
            p = p + d;
            temp = temp / 10;
            
            if (temp == 0 && p > 9) {
                temp = p;
                p = 0;
            }
        }
        System.out.println("Sum of digits of sum of digits: " + p);
        
        if (p == 1) {
            System.out.println("Magic number");
        } else {
            System.out.println("Not a magic number");
        }
    }
}
