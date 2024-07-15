//Q3. Write a Java program that reads two floating-point numbers and tests
//whether they are the same up to three decimal places.

import java.util.Scanner;
class Float_Comp{

	public static void main(String args[]){
	float a,b;
	Scanner shani=new Scanner(System.in);
	System.out.printf("Input floating-point number: ");
	a=shani.nextFloat();
	System.out.printf("Input floating-point another number: ");
	b=shani.nextFloat();
	
	 if(a!=b){
	 System.out.println("The are different");
	 }
	 else
	 {
	 System.out.println("They are same");
}
}
}