import java.util.Scanner;;
public class Factorial {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter Number For Factorial : ");
        int n=obj.nextInt();
        int k=1;
       
        // factorial using for loop
        // for (int i = n; i >=1; i--) {
        //     System.out.print("\t"+i);
        //     k=k*i;
        // }
        // System.out.println("\nFactorial : "+k);

        
        //factorial using while loop
        while (n>=1) {
            k=k*n;
            System.out.print("\t"+n);
            n--;
        }
        System.out.println("\nFactorial : "+k);

        obj.close();
    }
}
