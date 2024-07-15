import java.util.Scanner;
class Task_1{

	public static void main(String args[]){

	int n,temp,k;
	Scanner obj=new Scanner(System.in);
	n=obj.nextInt();
	int digit,sum=0;
	for(int i=1;i<=n;i++)
	{
	 temp=i;
	while(temp>0)
	{
	digit=temp%10;
	sum=sum+digit*digit*digit;
	temp/=10;
	}
		
	System.out.println(sum);
	

	}
	
}
}