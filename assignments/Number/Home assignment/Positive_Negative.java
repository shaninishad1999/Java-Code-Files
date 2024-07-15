//Q2. Write a Java program that reads a floating-point number and prints
//&quot;zero&quot; if the number is zero. Otherwise, print &quot;positive&quot; or &quot;negative&quot;. Add
//&quot;small&quot; if the absolute value of the number is less than 1, or &quot;large&quot; if it
//exceeds 1,000,000.

import java.util.Scanner;
class Positive_Negative{

	public static void main(String args[]){
	
	float number;
	Scanner obj=new Scanner(System.in);
	System.out.printf("Enter  Number : ");
	number=obj.nextFloat();
	if(number==0)
	{
	System.out.printf("Input value: %.0f\n", number);
	System.out.println("Zero Number");	
	}
	else if(number>0)
	{
	System.out.printf("Input value: %.0f\n", number);
	System.out.println("Positive Number");	
	} 
	else 
	{
	System.out.printf("Input value: %.0f\n ", number);
	System.out.println("Negative Number");	
	} 
}
}