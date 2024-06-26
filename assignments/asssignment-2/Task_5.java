import java.util.Scanner;
class Task_5{

	public static void main (String args[]){
	
	// data type decleration
	int a,b;
	Scanner obj=new Scanner(System.in);   //message for display
	System.out.print(" Input first number : ");  
	a=obj.nextInt();     //25	//taking input from user
	System.out.print(" Input second number : ");  //message for display
	b=obj.nextInt();     //5		//taking input from user

	//expected output
	System.out.println(a +" x "+b+ " = "+a*b);    //25 x 5 =125

}
}