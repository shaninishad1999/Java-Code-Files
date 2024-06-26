// 3. Write a program to accept a number N and print whether the number is EVEN or ODD
import java.util.Scanner;
class OddEven{

	public static void main(String args[]){

	int number;
	Scanner obj= new Scanner(System.in);
	System.out.println("Enter Two Number : ");
	number=obj.nextInt();
	

	if(number%2==0)
	{
	System.out.println("Number is even : "+number);
	}	
	else
	{
	System.out.println("Number is odd : " +number);
	}
}
}
