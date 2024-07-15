// Q7. Write a program to input a number. Check and display whether it is a Niven
// number or not. (A number is said to be Niven which is divisible by the sum of its digits).
// Example: Sample Input 126
// Sum of its digits = 1 + 2 + 6 = 9 and 126 is divisible by 9.

import java.util.Scanner;
class HomeWork_7{
	public static void main(String args[]){
	int n;
	Scanner shani=new Scanner(System.in);
	System.out.printf("Sample Input : ");
	n=shani.nextInt();  //126
	int a=n/100;   // a=1
	int b=(n%100)/10;  //b=2
	int c=(n%10)%10;   //c=6

	System.out.println("Sum of its digits = "+a+" + "+b+" + " +c+ " = "+(a+b+c)+ " " +n +" is divisible by " +(a+b+c));
	}
}
