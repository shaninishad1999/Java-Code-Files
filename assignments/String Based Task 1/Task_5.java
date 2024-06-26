import java.util.Scanner;
public class Task_5 {
    
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter String Lenght");
        int n=obj.nextInt();
        obj.nextLine();
        
        String[] a = new String[n];

        System.out.println("String array");
        for(int i=0;i<n.;i++)
        {
            a[i]=obj.nextLine();
        }
        System.out.println("Printed Array : ");
        for(int i=0;i<n.;i++)
        {
            if (a[i].toLowerCase().startsWith("b")) {

				
                System.out.println(a[i]);
			}
        }

    }
}
