// 1. Write a program to accept a number N and print whether it is positive, negative or zero
import java.util.Scanner;
class Positive_Negative{

	public static void main(String args[]){

	int N;
	Scanner obj= new Scanner(System.in);
	System.out.println("Enter Number : ");
	N=obj.nextInt();

	if(N==0)
	{
	System.out.println("Number Zero : " +N);
	}
	else if(N>0)
	{
	System.out.println("Number  Positive :"+N);
	}
	else
	{
	System.out.println("Number  Negative :"+N);
	}

}
}
	