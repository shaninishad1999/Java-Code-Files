import java.util.Scanner;
class Hamming{
	public static void main(String args[]){

	int n,sum=0,i;

	Scanner obj=new Scanner(System.in);
	System.out.println("Enter Number");
	n=obj.nextInt();

	for(i=1;i<=20;i++)
	{
	
	if(i%2==0 || i%3==0 || i%5==0)	
	{
	System.out.println(i);
	sum++;
	}
	}

System.out.println(sum);
}
}