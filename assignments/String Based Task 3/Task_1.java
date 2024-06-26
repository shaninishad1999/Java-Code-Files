import java.util.Scanner;
class Task_1{
	public static void main(String args[]){

	String str1,str2;
	Scanner obj=new Scanner(System.in);
	System.out.print("Input the 1st string : ");
	str1=obj.nextLine();
	System.out.print("Input the 2st string : ");
	str2=obj.nextLine();
		
	System.out.print("String1 : "+str1+"\n");
	System.out.print("String2 : "+str2+"\n");

	if(str1.equals(str2))
	{
	System.out.println("String are equal");
	}
	else
	{
	System.out.println("String are not equal");
	}
	
}
}