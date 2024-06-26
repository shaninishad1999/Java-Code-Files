import java.util.Scanner;
class Alaphabet{

	public static void main(String args[]){

	char ch;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter Number : ");
	ch=obj.next().charAt(0);

	if(ch>='a' && ch<='z')
	{
	System.out.println("Lower case");
	}
	else if(ch>='A' & ch<='Z')
	{
	System.out.println("Upercase");	
	}
	else if(ch>='0' & ch<='9')
	{
	System.out.println("Number");	
	}
	else
	{
	 System.out.println("Special Character");
}
	
	
	


}
}