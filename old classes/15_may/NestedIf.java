import java.util.Scanner;
class   NestedIf{

	public static void main(String args[]){
	char ch;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter Character : ");
	ch=obj.next().charAt(0);
	if( ch>='a')
	{
		if(ch<='z')
		{
			System.out.println("Lowercase");
			
		}
	}
	if( ch>='A')
	{
		if(ch<='Z')
		{
		System.out.println("Uppercase");	
		}
	}
	



}
}