import java.util.Scanner;

public class asci_value {
    public static void main(String args[]) {
        char ch;
        int asci_valuee;

        Scanner saci = new Scanner(System.in);
        System.out.println("Enter Character for asci value");
        ch=saci.next().charAt(0);
saci.close();
        asci_valuee=(int)ch;
        System.out.println("The ASCII value of " + ch + " is " + asci_valuee);


    }
}
