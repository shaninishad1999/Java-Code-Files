import java.util.Scanner;
class FunctionP{

 public static  String isNumberprime(int n){

	int i=0,count=0;
	for( i=1;i<=n;i++)
	{
	if(n%i==0)
	 {
	count++;
	}
		}
	if(count==2)
	{
	return "Prime Number";
	}
	else
	{
	return "Not Prime";
	}
	
		
}

	public static void main(String args[]){

	int n,i;
	System.out.print("Enter Any number : ");
	Scanner obj=new Scanner(System.in);
	n=obj.nextInt();
	
	System.out.print("Number : "+ isNumberprime(n));
}
}