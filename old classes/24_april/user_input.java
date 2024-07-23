import java.util.Scanner;

// additon   int float string use
public class user_input {

    public static void main(String[] args) {
        // int n1, n2, n3;
        // System.out.println("Enter First Number : ");
        // Scanner add = new Scanner(System.in);
        // n1 = add.nextInt();
        // System.out.println("Enter First Number : ");
        // n2 = add.nextInt();
        // add.close();
        // n3 = n1 + n2;
        // System.out.println("Addition : " + n3);

        // float r, cr, ar;
        // System.out.println("Enter Radius : ");
        // Scanner rect = new Scanner(System.in);
        // r = rect.nextFloat();
        // rect.close();
        // ar=3.14f*r*r;
        // cr=2*3.14f*r;
        // System.out.println("Area : " + ar);
        // System.out.println("Area : " + cr);

        // double r, cr, ar;
        // System.out.println("Enter Radius : ");
        // Scanner rect = new Scanner(System.in);
        // r = rect.nextDouble();
        // rect.close();
        // ar=3.14f*r*r;
        // cr=2*3.14f*r;
        // System.out.println("Area : " + ar);
        // System.out.println("Area : " + cr);

        String name;
        char s;

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Full Name : ");
        // Scanner obj=new next();
        name = obj.nextLine();

        System.out.println("Enter Scetion : ");
        s = obj.next().charAt(0);
        System.out.println("Name : " + name);
        System.out.println("Name : " + s);

        
        obj.close();
    }
}