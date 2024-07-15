import java.util.Scanner;
class Task_3{


public static void isFindString(String s){

	String[] str=s.split(" ");
	int count=0;
	for(int i=0;i<str.length;i++)
	{
	  if(str[i].toLowerCase().contains("the"))
	{
	count++;
	}

	}
System.out.print("The frequency of the word 'the' is :"+count);	
}
public static void main(String args[]){

Scanner obj=new Scanner (System.in);
System.out.print("Input string : ");
String str=obj.nextLine();

isFindString(str);
}
}