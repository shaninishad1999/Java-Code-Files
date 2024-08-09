import java.util.Scanner;

public class SwapNumbers {
    public static void main(String args[]){

        // float num1,num2,temp;

        

        // Scanner swap_number=new Scanner(System.in);

        // System.out.print("Enter First Number : ");
        // num1=swap_number.nextFloat();
        // System.out.print("Enter second Number : ");
        // num2=swap_number.nextFloat();

        // System.out.print("Before swap first Number: "+ num1);
        // System.out.print("\nBefore swap Second Number: "+ num2);
        
        // temp=num1;
        // num1=num2;
        // num2=temp;
        // swap_number.close();
        // System.out.print("\nAfter swap First Number : "+ num1 );
        // System.out.print("\nAfter swap Second Number : "+ num2 );

        float num1,num2;

        Scanner swap_number=new Scanner(System.in);

        System.out.print("Enter First Number : ");
        num1=swap_number.nextFloat();
        System.out.print("Enter second Number : ");
        num2=swap_number.nextFloat();

        System.out.print("Before swap first Number: "+ num1);    //45.78
        System.out.print("\nBefore swap Second Number: "+ num2);  //20.25
        
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        swap_number.close();
        System.out.print("\nAfter swap First Number : "+ num1 );
        System.out.print("\nAfter swap Second Number : "+ num2 );






    }
    
}
