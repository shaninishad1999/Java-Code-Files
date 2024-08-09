import java.util.Scanner;
public class SwapNumber {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        // Swap Number using third variable
        // int temp,a,b;
        // System.out.println("Enter Two Number : ");
        // a=obj.nextInt();
        // b=obj.nextInt();
        // System.out.println("Before Swap a = "+a);
        // System.out.println("Before Swap b = "+b);
        // temp=a;
        // a=b;
        // b=temp;
        // System.out.println("\nAfter Swap a = "+a);
        // System.out.println("After Swap b = "+b);

        // swap number using arithmetic operator
                
        // int a,b;
        // System.out.println("Enter Two Number : ");
        // a=obj.nextInt();  //10
        // b=obj.nextInt();  //20
        // System.out.println("Before Swap a = "+a);
        // System.out.println("Before Swap b = "+b);
        // a=a+b;
        // b=a-b;
        // a=a-b;
        // System.out.println("\nAfter Swap a = "+a);
        // System.out.println("After Swap b = "+b);


        // swap number using logical operator
          int a,b;
        System.out.println("Enter Two Number : ");
        a=obj.nextInt();  //10
        b=obj.nextInt();  //20
        System.out.println("Before Swap a = "+a);
        System.out.println("Before Swap b = "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("\nAfter Swap a = "+a);
        System.out.println("After Swap b = "+b);
        obj.close();
    }
}
