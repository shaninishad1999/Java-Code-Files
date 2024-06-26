import java.util.Scanner;
class Prime{
	public static void main(String args[]){

	Scanner obj=new Scanner(System.in);
	System.out.print("Enter Number : ");
	int n=obj.nextInt();
	int count=0,s=0;
	for(int i=2;i<=1000;i++)
	{

	if(n%i==0)
	{
	s++;
	}
	count++;
	}
	System.out.print("count = "+count);
	System.out.print("\ns = "+s);


}
}
	
	