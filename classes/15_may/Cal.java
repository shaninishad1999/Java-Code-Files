/*Q1. Write a java program to create basic calculator
using switch or else if? */
import java.util.Scanner;

class Cal{

	public static void main(String args[]){

	char ch;
	int a,b;
	Scanner obj=new Scanner(System.in);
	Scanner calc=new Scanner(System.in);
	System.out.println("Enter Your Choce ");
	System.out.println("+ For Addition, - For Subtraction, * For Multiplication, / For Devision");
	ch=obj.next().charAt(0);

	switch(ch){
	case '+':
	{
	System.out.print("Enter First Number : ");
	a=calc.nextInt();
	System.out.print("Enter Second Number : ");
	b=calc.nextInt();
	
	System.out.println("Addition : "+(a+b));
	break;
	}
	case '-':
	{
	System.out.print("Enter First Number : ");
	a=calc.nextInt();
	System.out.print("Enter Second Number : ");
	b=calc.nextInt();
	
	System.out.println("Subtraction : "+(a-b));
	break;
	}

	case '*':
	{
	System.out.print("Enter First Number : ");
	a=calc.nextInt();
	System.out.print("Enter Second Number : ");
	b=calc.nextInt();
	
	System.out.println("Multiplication : "+(a*b));
	break;
	}

	case '/':
	{
	System.out.print("Enter First Number : ");
	a=calc.nextInt();
	System.out.print("Enter Second Number : ");
	b=calc.nextInt();
	
	System.out.println("Devision : "+(a/b));
	break;
	}
	default:
	{
	System.out.println("Please Enter Valid Input");
	}
	}


}
}
	