import java.util.Scanner;
class Task_1{

public static void isSubstringContain(String s){

	if(s.contains("search"))
	{
	System.out.print("The substring is exists in the string.");
	}
	else
	{
	System.out.print("The substring is not exists in the string.");
	}


}

public static void main(String args[]){

	Scanner obj=new Scanner(System.in);
	System.out.print("input the string : ");
	String str=obj.nextLine();
	isSubstringContain(str);
	
	
}
}
