import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
	System.out.println();
        System.out.println("Enter String: ");
        String str = obj.nextLine();

        if (str.length() >= 3) {
            for ( int i = 0; i < str.length(); i++) {
	
	char ch=str.charAt(i);
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch<= 'Z')) {
                    System.out.print(ch);
                } else {
                    System.out.println("\nError");
                    break;
                }
            }
        } else {
            System.out.println("Error");
        }
    }
}
