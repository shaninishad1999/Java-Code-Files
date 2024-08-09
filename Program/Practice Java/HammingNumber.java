import java.util.Scanner;
class HammingNumber{
	public static void main(String args[]){
	Scanner obj=new Scanner(System.in);
	System.out.print("n= ");
	int n=obj.nextInt();
	int sum=0,temp;
	int count=0;
	
	System.out.println("The Hamming  numbers are : \n");
	for(int i=1; i<=n;i++)
	{
	
	
	if(n%2==0 || n%3==0 || n%5==0)
	{
	System.out.println(i);
	
	}
	
	
	}
	
	
}
}