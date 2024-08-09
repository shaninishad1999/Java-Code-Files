import java.util.Scanner;
public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Number ");
        int n=obj.nextInt();
        int a=0,b=1,c=0;

        System.out.print("\t"+a);
        for (int i = 1; i <=n ; i++) {
            a=b;
            b=c;
            c=a+b;
            System.out.print("\t"+c);
            
        }

        obj.close();
    }
}
