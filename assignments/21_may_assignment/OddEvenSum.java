// 4. Write a program to accept two numbers and print whether their sum is EVEN or ODD
import java.util.Scanner;
class OddEvenSum{

	public static void main(String args[]){

	int a,b;
	Scanner obj= new Scanner(System.in);
	System.out.println("Enter Two Number : ");
	a=obj.nextInt();
	b=obj.nextInt();

	if((a+b)%2==0)
	{
	System.out.println("After Adding ,Number is even : "+(a+b));
	}	
	else
	{
	System.out.println("After Adding ,Number is odd : " +(a+b));
	}
}
}
