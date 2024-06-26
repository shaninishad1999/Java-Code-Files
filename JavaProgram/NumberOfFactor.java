import java.util.Scanner;
public class NumberOfFactor {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Numer for Factor ");
        int n=obj.nextInt();

        for (int i = 1; i <=n ; i++) {
            if (n%i==0) {
            
                    
                    System.out.print("\t"+i);
                
                
            }
        
            
        }

        obj.close();
    }
}
