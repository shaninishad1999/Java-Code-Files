import java.util.Scanner;
class Number{

	public static void main(String args[]){

	int number;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter Number : ");
	number=obj.nextInt();

	if(number>0)
	{
	System.out.println("Number is Positive");
	}
	if(number<0)
	{
	System.out.println("Number is Negative");	
	}

}
}