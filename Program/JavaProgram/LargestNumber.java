import java.util.Scanner;;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter two number");

        //  greater between two number 

        // int a=obj.nextInt();
        // int b=obj.nextInt();

        // if (a>b) {
        //     System.out.println("a is greater");
        // }
        // else
        // {
        //     System.out.println("b is greater");
        // }

// greater between there number


            int a=obj.nextInt();
            int b=obj.nextInt();
            int c=obj.nextInt();
        if (a>b && a>c) {
            System.out.println("a is greater");
        }
        else if (b>a && b>c) {
            
            System.out.println("b is greater");
        }
        else
        {
            System.out.println("c is greater ");
        }


        obj.close();
    }
}
