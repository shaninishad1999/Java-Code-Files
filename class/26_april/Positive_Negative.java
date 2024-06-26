import java.util.Scanner;

public class Positive_Negative {

    public static void main(String args[]){
        int number;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        number=obj.nextInt();
        if (number>0) {

            System.out.println("\nNumber is Positive");
            
        }
        else if (number<0) {
            System.out.println("\nNumber is Negative");
        }
        else{
            System.out.print("Number is Neither Positive nor Negative");
        }
        obj.close();
    }
}