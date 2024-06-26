//2. Write a program to accept two numbers and print the greater value of the two
import java.util.Scanner;
class GreaterNumber{

	public static void main(String args[]){

	int a,b;
	Scanner obj= new Scanner(System.in);
	System.out.println("Enter Two Number : ");
	a=obj.nextInt();
	b=obj.nextInt();

	if(a==b)
	{
	System.out.println("Both   Number  Equal : " +a+ " and " +b);
	}
	else if(a>b)
	{
	System.out.println("First  Number  Greater : " +a);
	}
	else
	{
	System.out.println("Second  Number  Greater : " +b);
	}
}
}