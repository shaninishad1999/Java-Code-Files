import java.util.Scanner;
class Abundant{

	public static void main(String args[]){

	int i,n,sum=0;
	Scanner obj=new Scanner(System.in);
	System.out.print("Consider the number : ");
	n=obj.nextInt();
	System.out.print("Factors of "+n+" = ");
	for(i=1;i<n;i++)
	{
	if(n%i==0)
	{
	System.out.print(i +"\t");
	sum=sum+i;
	}
	}
System.out.println( );
System.out.println("Sum = "+sum);
if(sum>n)
{
System.out.println("Abundant number");
}
else
{
System.out.println("Not abundant number");
}
}
}	
	