import java.util.Scanner;

public class Even_odd {

    public static void main(String args[]){

        int number;

        Scanner evenodd=new Scanner(System.in);
        System.out.print("Enter Number : ");
        number=evenodd.nextInt();

        if (number%2==0) {

            System.out.println("Number is Even : "+ number);
            
        }
        else{

            System.out.println("Number is Odd : "+ number);
        }
        evenodd.close();

    }
    
}
