import java.util.Scanner;
class F1{



	public static void printTable(int n){  //formal argument

	for(int i=1;i<=10;i++)
	{
	System.out.printf("\n%d * %d = %d", n,i,n*i );
	}
	}
	public static void main(String args[]){

	Scanner obj=new Scanner(System.in);
	System.out.println("Enter Number");
	int a=obj.nextInt();
	printTable(a); //actual argument
}
}

