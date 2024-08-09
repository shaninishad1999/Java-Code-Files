import java.util.Scanner;
class EvenOdd{

	public static void main(String args[]){

	int number;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter Number : ");
	number=obj.nextInt();

	if(number%2==0)
	{
	System.out.println("Number is Even");
	}
	else
	{
	System.out.println("Number is Odd");	
	}
	

}
}