// Q8. Write a program to accept a number and check whether it is a &#39;Spy Number&#39; or
// not. (A number is spy if the sum of its digits equals the product of its digits.)

// Example: Sample Input: 1124
// Sum of the digits = 1 + 1 + 2 + 4 = 8
// Product of the digits = 1*1*2*4 = 8




import java.util.Scanner;
class HomeWork_8{
	public static void main(String args[]){
	int n;
	Scanner shani=new Scanner(System.in);
	System.out.printf("Sample Input : ");
	n=shani.nextInt();  //1124
	int a=n/1000;   // a=1
	int b=(n%1000)/100;  //b=1
	int c=((n%1000)%100)/10;   //c=2
	int d=((n%1000)%100)%10;   //c=4

	System.out.println("Sum of its digits "+a+" + "+b+" + " +c+ " + "+d+" = "+(a+b+c+d));
	System.out.println("Product of the digits "+a+" * "+b+" * " +c+ " * " +d+" = "+(a*b*c*d));

	// System.out.println("Sum of its digits = "+a+" + "+b+" + " +c+ " = "+(a+b+c)+ " " +n +" is divisible by " +(a+b+c));
	}
}
