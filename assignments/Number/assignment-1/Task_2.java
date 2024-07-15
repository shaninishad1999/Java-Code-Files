import java.util.Scanner;  //  importing Scanner class for taking user input
class Task_2{
	public static void main (String args[]){
	
	//data type declaration
	int days,rm,number;
	Scanner obj=new Scanner(System.in);

	System.out.println("Input no. of days : ");   //message for display
	days=obj.nextInt();    //2535		// taking user input 
	
	number=days/365;    //number=6
	rm=days%365;	//rm=345
	System.out.println(number + " Year(s)");   //print the expected output


	number=rm/30;	//number=11
	rm=rm%30;	//rm=15
	System.out.println(number + " Month(s)");  //print the expected output

	number=rm%30;   //number=15
	System.out.println(number + " Day(s)");    	//print the expected output

}
}
	
	