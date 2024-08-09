import java.util.Scanner;
class  DecimalBinary{

	public static void main(String args[]){

	Scanner obj=new Scanner(System.in);
	System.out.println("Enter any number");
	int n=obj.nextInt();
	int arr[]=new int[20];
	int i=0,r;
	while(n>0)
	{
	 r=n%2;
	arr[i]=r;
	i++;
	n=n/2;
	}
	System.out.println("Binary Number");
	for(i=i-1;i>=0;i--)
	{		
	System.out.print("\t"+arr[i]);
	}
}
}
