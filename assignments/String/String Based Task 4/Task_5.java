import java.util.Scanner;
class Task_5{

public static void isFrequency(String s,char p){

	char[] ch=s.toCharArray();
	int count=0,i;
	for( i=0;i<ch.length;i++)
	{
	if(ch[i]==p)
	{
	count++;
	}

	}

System.out.print("The frequency of "+p+" is :"+count);
}

public static void main(String args[]){

Scanner obj=new Scanner(System.in);
System.out.print("Input the string :");
String str=obj.nextLine();
System.out.print("Input the character to find frequency:");
char pos = obj.next().charAt(0);

isFrequency(str,pos);
}
}