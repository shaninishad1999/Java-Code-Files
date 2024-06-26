import java.util.Scanner;
class Task_6{

	public static void main(String args[]){

	//data type declaration
	int a,b;
	Scanner obj=new Scanner(System.in);
	System.out.print("Input first number : ");  //message for display
	a=obj.nextInt();   //125          //taking input from user
	System.out.print("Input second number : ");  //message for display
	b=obj.nextInt();     //24    //taking input from user
	
	//expected output
	System.out.println(a+" + "+b +" = "+(a+b));
	System.out.println(a+" - "+b +" = "+(a-b));
	System.out.println(a+" X "+b +" = "+(a*b));
	System.out.println(a+" / "+b +" = "+(a/b));
	System.out.println(a+" mod "+b+ " = "+(a%b));
}
}