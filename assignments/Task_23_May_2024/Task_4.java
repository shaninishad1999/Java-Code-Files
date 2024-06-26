import java.util.Scanner;

class Task_4{
	public static void main(String args[]){

	int n;
	Scanner shani=new Scanner(System.in);
	System.out.printf("Enter Number : ");
	n=shani.nextInt();
	System.out.println("Triangular Numbers : ");
	int sum=1;
	for(int i=2;i<=n;i++)
	{
	
	sum+=i;
	
	System.out.println(sum);
	if(sum==n)
	break;
	}

	

}
}