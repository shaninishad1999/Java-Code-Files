import java.util.Scanner;
public class Hcf {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Two Number : ");
        int n=obj.nextInt();
        int m=obj.nextInt();

        // int h=m<n?m:n;
        // for (int i = 1; i <h; i++) {
        //     if (m%h==0 && n%h==0) {
        //         System.out.println("Lcm = "+h);
        //         break;
        //     }
        //     h--;
        // }

        int h=m<n?m:n;
       while (true) {
        
            if (m%h==0 && n%h==0) {
                System.out.println("Hcf = "+h);
                break;
            }
            h--;
        }
        obj.close();
    }
    
}

