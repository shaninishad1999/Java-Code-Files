import java.util.Scanner;

public class user_input {

    public static void main(String args[]) {
        int a;
        System.out.println("Please take user input : ");
        Scanner usr_input = new Scanner(System.in);
        a = usr_input.nextInt();
        System.out.println(a);

        usr_input.close();

    }
}