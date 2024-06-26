
import java.util.Scanner;
class T1{
	public static void main(String args[]){
	
	int n,sum=0,digit,i;
	Scanner obj=new Scanner(System.in);
	System.out.printf("Enter Number : ");
	n=obj.nextInt();
	
	while(n!=0)
	{
	   digit=n%10;
	 sum=sum+digit;
	n=n/10;
	}
	System.out.println("Sum of digit :" +sum);
	
	for(i=1;i<=n;i++)
	{
	if(n%i==0)
	{
	System.out.println("factor : "+i+"\t");
	}
	}
}
}
	