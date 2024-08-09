import java.util.Scanner;
public class LeapYear {
    
    public static void main(String[] args) {
        
        Scanner obj=new Scanner(System.in);

        //  cheacking year is leap year or not 

        // System.out.println("Enter Any Year");
        // int year=obj.nextInt();

        // if ((year%400==0 && year%100!=0)|| year%4==0) {
        //     System.out.println("It is leap year");
            
        // }
        // else{
        //     System.out.println("It is not leap year");
        // }


            System.out.println("Enter Start Number");
            int a=obj.nextInt();
            System.out.println("Enter Ending Number");
            int b=obj.nextInt();
            for (int i = a; i <=b ; i++) {
                if ((i%400==0 && i%100!=0)|| i%4==0) {
            System.out.print("\t"+i);
            
        }
                
            }

        obj.close();
    }
}
