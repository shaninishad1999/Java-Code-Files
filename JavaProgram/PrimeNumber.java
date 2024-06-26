import java.util.Scanner;;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // checking prime number

        // System.out.println("Enter Number ");

        // int n = obj.nextInt();
        // int f = 0;

        // for (int i = 1; i <= n; i++) {
        // if (n % i == 0) {

        // f++;

        // }

        // }
        // if (f == 2) {
        // System.out.println("It is Prime Number");
        // } else {
        // System.out.println("It is Composite Number");
        // }


        // print array list of give number

        System.out.println("Enter Starting number ");
        int m = obj.nextInt();

        System.out.println("Enter Ending number ");
        int n = obj.nextInt();

        int count;

        for (int i = m; i <= n; i++) {
            count = 0;

            // Check for divisibility from 2 up to i/2
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++; // Increment if 'i' is divisible by 'j'
                    break; // Exit loop if a divisor is found
                }
            }

            if (count == 0) {
                System.out.println(i); // Output the prime number
            }
        }



//         System.out.println("Enter Starting number ");
//         int n = obj.nextInt();

// int i,j,counter;
//         for(j=2;j<=n;j++){
//             counter=0;
//             for(i=1;i<=j;i++){
//                if(j%i==0){
//                   counter++;
//                }
//             }
//             if(counter==2)
//             System.out.print(j+" ");
//          }
//         obj.close();
//     }
// }
