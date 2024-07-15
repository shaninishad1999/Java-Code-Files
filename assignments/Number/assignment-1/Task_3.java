import java.util.Scanner;    //importing Scanner class for taking user input

class Task_3{

	public static void main (String args[]){
	
	//data type declartion
	float num1,num2,num3,num4,num5;
	Scanner obj=new Scanner(System.in);
	System.out.print("First Number : "); 	//message for display 
	num1=obj.nextFloat();			//taking input form user
	System.out.print("Second Number : ");	 //message for display
	num2=obj.nextFloat();			//taking input form user
	System.out.print("Third Number : ");	 //message for display
	num3=obj.nextFloat();			//taking input form user
	System.out.print("Fourth Number : ");	 //message for display
	num4=obj.nextFloat();			//taking input form user
	System.out.print("Fifth Number : ");	 //message for display
	num5=obj.nextFloat();			//taking input form user
	
	//average calculation
	float avg=(num1+num2+num3+num4+num5)/5;

	//expected output
	 System.out.printf("Average value of all numbers: %.2f", avg);

	

}
}