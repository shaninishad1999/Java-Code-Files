import java.util.Scanner;

public class add_2_integer {
    public static void main(String args[]){
        int num1,num2,addition;

        Scanner add=new Scanner(System.in);
        System.out.print("Enter Number first : ");
        num1=add.nextInt();
        System.out.print("Enter Number Second : ");
        num2=add.nextInt();

        addition=num1+num2;
        add.close();
        System.out.println("Addition of two number is : "+addition);
    }
    
}
