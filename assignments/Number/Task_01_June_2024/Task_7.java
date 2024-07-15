import java.util.Scanner;
class Task_7{

	public static void main(String args[]){

	int num;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number : ");
	num=sc.nextInt();

	if(num%111==0)
	{
	System.out.print(num+"is a Nelson number.");
	}
	else
	{
	System.out.println(num+"is not a Nelson number.");
	}
}
}