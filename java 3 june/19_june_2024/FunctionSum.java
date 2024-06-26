import java.util.Scanner;
class FunctionSum{

	public static void add(){
	int n3;
	Scanner obj=new Scanner(System.in);
	System.out.print("Enter First Number : ");
	int n=obj.nextInt();
	System.out.print("Enter Second Number : ");
	int n1=obj.nextInt();
	 n3=n+n1;
	System.out.println("sum = "+n3);
}
	 public static void main(String args[]){

	add();
	add();
}
}