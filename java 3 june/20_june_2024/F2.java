//taking nothing return something
import java.util.Scanner;
class F2
{



	public static int add(){  //formal argument

	Scanner obj=new Scanner(System.in);
	System.out.println("Enter 2 Number");
	int a=obj.nextInt();
	int b=obj.nextInt();
	 return a+b;
	}
	public static void main(String args[]){

	
	int r=add(); //actual argument
	System.out.println("Addititon = "+r);
}
}

