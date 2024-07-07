import java.util.Scanner;
class Number_2{

	public static void main(String args[]){

	int number;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter Number : ");
	number=obj.nextInt();

	if(number>0)
	{
	System.out.println("Number is Positive");
	}
	else
	{
	System.out.println("Number is Negative");	
	}

}
}