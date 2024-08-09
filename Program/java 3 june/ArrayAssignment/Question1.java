import java.util.Scanner;
class Question1{
	public static void main(String args[]){

	int n;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter Number");
	n=obj.nextInt();
	for(int i=1;i<=n;i++)
	{
	if(i%2==0 || i%3==0 || i%5==0 )
	{
	System.out.print(i+"\t");
	}
	
	}
	
}
}