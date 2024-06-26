import java.util.Scanner;   //importing Scanner class for taking user input
class Task_5{

	public static void main (String args[]){
	
	//data type declaration
	float c,f;
	Scanner obj=new Scanner(System.in);
	System.out.println("Input a degree in Fahrenheit : ");  //message for display 
	f=obj.nextFloat();                 // taking user input 
	
	
	c=(5*(f-32))/9;

	//print the expected output
	System.out.println(f+" degree Fahrenheit is equal to "+c +" in Celsius");

}
}