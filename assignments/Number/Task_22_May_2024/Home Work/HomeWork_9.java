// Q9. A special two-digit number is such that when the sum of its digits is added to the
// product of its digits, the result is equal to the original two-digit number.

// Example: Consider the number 59.
// Sum of digits = 5 + 9 = 14
// Product of digits = 5 * 9 = 45
// Sum of the sum of digits and product of digits = 14 + 45 = 59

import java.util.Scanner;
class HomeWork_9{
	public static void main(String args[]){
	int a;
	Scanner shani=new Scanner(System.in);
	System.out.printf("Consider the number : ");
	a=shani.nextInt();
	int b=a/10;
	int c=a%10;
	System.out.println("Sum of digits = "+b+ " + "+c+" = "+(b+c));
	System.out.println("Sum of digits = "+b+ " * "+c+" = "+(b*c));
	


}
}