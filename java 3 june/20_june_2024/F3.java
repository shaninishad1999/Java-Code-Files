//taking something return something
import java.util.Scanner;
class F3
{

	public static int add(int a,int b){  //formal argument

	
	 return a+b;
	}
	public static void main(String args[]){

	Scanner obj=new Scanner(System.in);
	System.out.println("Enter 2 Number");
	int x=obj.nextInt();
	int y=obj.nextInt();

	int r=add(x,y); //actual argument
	System.out.println("Addititon = "+r);
}
}

