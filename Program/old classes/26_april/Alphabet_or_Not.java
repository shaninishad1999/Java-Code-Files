import java.util.Scanner;

public class Alphabet_or_Not {

    public static void main (String args[]){
        char ch;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Any character : ");
        ch=obj.next().charAt(0);

        if (ch>='a' && ch<='z' || ch>='A'&& ch<='Z') {
            System.out.print("It is alphabet. ");
            
        }
        else{
            System.out.print("\nIt is not alphabet.");
        }
        obj.close();
    }
    
}
