import java.util.Scanner;

class Task_1 {

	public static void main(String args[]) {

	int i,digit,sum=0,s=0;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter number");
	int n=obj.nextInt();
	int num=n;
	int d,add=0;
	while(num!=0)
	{
	  d=num%10;
	  add=add+d;
	num/=10;
	}

	for(i=1;i<n;i++)
	{
	 
	 while(n%i==0)
	{
	//System.out.print("\t"+i);
	 s=s+i;  //adding value prime number
	n=n/i;  
	}
	}
	if(n>1)
	{
	//System.out.print("\t"+i);  //last prime number print
	}
	while(n!=0) //divid and sum of last prime number digit
	{
	digit=n%10;
	sum=sum+digit;
	n/=10;
	}
	//System.out.println("\nsum "+(s+sum));  //sum of last prime number and starting prime number
	if(add==(s+sum))
	{
	System.out.println("smith number");
	}
	else
	{
	System.out.println("Not Smith number");
	}
	
	
	
	
	



}
}