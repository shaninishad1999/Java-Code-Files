import java.util.Scanner;    //importing Scanner class for taking user input

class  Task_1{

	public static void main (String args[]){

	//data type declaration
	int seconds,h,m,rm;

	Scanner obj=new Scanner(System.in);

	System.out.println("Input Seconds : "); 	  //message for display 
	seconds=obj.nextInt();  //25300            	  // taking user input 
	
	//calculation of converting seconds in h:m:s

	h=seconds/3600;   	//h=7
	rm=seconds%3600;  //rm=100
	m=rm/60;    	//m=1
	seconds=rm%60;

	
	//print the expected output
	System.out.println("There are :");
	System.out.println("H:M:S - " +h+":"+m+":"+seconds );

	
	
	 

}
}