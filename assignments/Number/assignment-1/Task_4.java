import java.util.Scanner; //importing Scanner class for taking user input

class Task_4{
	public static void main(String args[]){

	//data type declaration
	int quotient ,remainder,numerator,denominator;
	Scanner obj=new Scanner(System.in);

	System.out.print("Input numerator : ");     //message for display 
	numerator=obj.nextInt();		 // taking  input from user
	
	System.out.print("Input denominator : ");  //message for display 
	denominator=obj.nextInt();		 // taking  input from user

	quotient=numerator/denominator;
	remainder=numerator%denominator;

	//print the expected output
	System.out.println("quotient = "+quotient+ ", remainder = "+remainder);
	
	
}
}