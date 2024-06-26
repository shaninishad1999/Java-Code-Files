// Q6. Write a Java program that takes a year from the user and prints
// whether it is a leap year or not.

import java.util.Scanner;
class Q_6{

	public static void main(String args[]){
	int year;
	Scanner shani=new Scanner(System.in);
	System.out.printf("Input the year: ");
	year=shani.nextInt();
	
	if((year%4==0 && year%100!=0) || year%400==0)
	{
	System.out.println(year+" is a leap year");
	}
	else
	{
	System.out.println(year+" is a not leap year");
	}
}
}
	