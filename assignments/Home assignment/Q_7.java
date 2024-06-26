// Q7. Write a program in Java to input 5 numbers from the keyboard and find
// their sum and average.
import java.util.Scanner;
class Q_7{

	public static void main(String args[]){
	float a,b,c,d,e,sum,avg;
	Scanner shani=new Scanner(System.in);
	System.out.printf("Input the 5 numbers : ");
	a=shani.nextFloat();
	b=shani.nextFloat();
	c=shani.nextFloat();
	d=shani.nextFloat();
	e=shani.nextFloat();
	
	System.out.println("Input the 5 numbers : ");
	System.out.printf("%.0f\n%.0f\n%.0f\n%.0f\n%.0f\n",a,b,c,d,e);
	System.out.printf("The sum of 5 no is :%.0f\n ",(a+b+c+d+e));
	System.out.printf("The Average is : %.1f ",(a+b+c+d+e)/5);

}
}