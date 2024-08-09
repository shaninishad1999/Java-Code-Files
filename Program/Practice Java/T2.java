
import java.util.Scanner;
class T2{
	public static void main(String args[]){

	int n,m,i,sum=0,s=0,d;
	Scanner shani=new Scanner(System.in);
	System.out.println("Enter Number : ");
	n=shani.nextInt();  //666
	m=shani.nextInt();
	
	if(n<m && m>n)
	{
	for(i=n;i<=m;i++)
	{
	 
	 
	int temp=sum;
	 while(temp>0)
	 {
	 int   digit=temp%10;   
	   s=s+digit;
	  temp=temp/10;
	
	  }

	if(s==1)
	{
	System.out.println("magic number");
	}
	else
	{
	System.out.println("Not a magic number");
	}
	}
}
	else
	{
	System.out.println("Invalid Input");
	}
	
	 
}
}
	