import java.util.Scanner;

public class SimplePattern {

    public static void main(String[] args) {

        // simple pattern
        // for (int i = 0; i < 5; i++) {

        // for (int j = 0; j < 5; j++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // }

        // simple pattern 2

        // for (int i = 1; i < =5; i++) {

        // for (int j = 0; j < 5; j++) {
        // System.out.print(i);
        // }
        // System.out.println();

        // }

        // simple pattern 3

        // for (int i = 0; i < 5; i++) {

        // for (int j = 1; j <= 5; j++) {
        // System.out.print(j);
        // }
        // System.out.println();

        // }

        // Triangle  4

        // for (int i = 0; i < 5; i++) {

        //     for (int j = 1; j <= 5-i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();

        // }

          // Triangle  5
        // for (int i = 0; i < 5; i++) {

        //     for (int j = 5; j >=1 ; j--) {
        //         System.out.print(j);
        //     }
        //     System.out.println();

        // }


          // Triangle  6
        // for (int i = 1; i <= 5; i++) {

        //     for (int j = 1; j <=i ; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();

        // }


        //   // Triangle  7
        // for (int i = 1; i <= 5; i++) {
            
        //     for (int k = 1; k <=i; k++) {
        //         System.out.print(" ");
                
        //     }
        //     for (int j = 1; j <=5-i ; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
            

        // }


          // Triangle  8
        //   int k;
        // for (int i = 1; i <= 5; i++) {
            
        //     for ( k = 5; k >=i; k--) {
        //         System.out.print(" ");
                
        //     }
        //     for (int j = 1; j <=k ; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
            

        // }
          // Triangle  8
          int k,i ,j;
        for ( i = 1; i <= 5; i++) {
            
            for ( k = 5; k >=i; k--) {
                System.out.print(" ");
                
            }
            for ( j = 1; j <=k ; j++) {
                System.out.print("* ");
            }
            System.out.println();
            

        }
// obj.close();
    }
}