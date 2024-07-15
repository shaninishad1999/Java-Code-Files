// Q1. Write a Java program that takes three numbers from the user and prints the greatest number.
import java.util.Scanner;
class GreaterNumber{

	public static void main(String args[]){

	int a,b,c;
	Scanner obj= new Scanner(System.in);
	System.out.println("Enter Three Number : ");
	a=obj.nextInt();
	b=obj.nextInt();
	c=obj.nextInt();

	 if(a==b && b==c && c==a)
	 {
	 System.out.println("Three  Number  Equal : " +a+ " and " +b+ " and "+c);
	 }
	 else if(a>b && a>c)
	// if(a>b && a>c)
	{
	System.out.println("First  Number  Greater : " +a);
	}
	else if(b>a && b>c)
	{
	System.out.println("Second  Number  Greater : " +b);
	}
	else 
	{
	System.out.println("Third  Number  Greater : " +c);
	}
}
}
