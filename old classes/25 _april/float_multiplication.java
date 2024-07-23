import java.util.Scanner;

public class float_multiplication {

    public static void main (String args[]){
        float num1,num2,product;

        Scanner multi=new Scanner(System.in);

        System.out.print("Enter First Number : ");
        num1=multi.nextFloat();
        System.out.print("Enter Second Number : ");
        num2=multi.nextFloat();

        product=num1*num2;

        multi.close();
        System.out.print("Multiplication of two number : "+product);
        
    }
    
}
