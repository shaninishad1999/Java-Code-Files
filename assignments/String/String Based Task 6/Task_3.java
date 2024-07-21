import java.util.Scanner;

class Task_3 {

	public static void main(String args[]){

	
	Scanner obj=new Scanner(System.in);

	System.out.print("Input : str = ");
	String str=obj.nextLine();
	System.out.print("Input  index =  ");
	int  index=obj.nextInt();

	for(int i=0;i<str.length();i++)
	{
	     if(str.charAt(i)==str.charAt(index))
	{
	System.out.println(str.charAt(i));
	break;
	}
	
	}
}
}