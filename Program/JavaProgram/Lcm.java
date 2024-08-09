import java.util.Scanner;
public class Lcm {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Two Number : ");
        int n=obj.nextInt();
        int m=obj.nextInt();

        int l=m>n?m:n;
        for (int i = 1; i <=l; i++) {
            if (l%m==0 && l%n==0) {
                System.out.println("Lcm = "+l);
                break;
            }
            l++;
        }

        obj.close();
    }
    
}
