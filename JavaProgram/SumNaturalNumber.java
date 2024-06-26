import java.util.Scanner;;
public class SumNaturalNumber {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter Any Number");
        int n=obj.nextInt();
        int sum=0;
        for (int i = 0; i <=n; i++) {
                System.out.print("\t"+i);
            sum=sum+i;
            
        }
        System.out.println("\nSum of Natural Number = "+sum);



        obj.close();
    }
}
