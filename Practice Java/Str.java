import java.util.Scanner;

class Str{

	public static void main(String args[]){
	Scanner obj=new Scanner(System.in);
	String str;
	System.out.println("Enter String :");
	str=obj.nextLine();
	
	for(int i=0;i<str.length();i++)
	{
	char ch=str.charAt(i);
	if(ch>='0' && ch<='9')
	{
	System.out.print(ch);
	}
	
	}
}
}