import java.util.Scanner;
public class TriangularNumber {
    
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Number ");
        int n=obj.nextInt();
        int sum=1;
        for (int i = 2; i <=n ; i++) {
            sum+=i;
            System.out.print("\t"+sum);
            if (sum==n) {
                break;
                
            }
            
        }
        obj.close();
    }
}
