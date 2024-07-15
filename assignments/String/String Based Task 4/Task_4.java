import java.util.Scanner;
class Task_4{

public static void removeCharacter(String s){

  	char[] ch=s.toCharArray();
	StringBuilder str=new StringBuilder();
 for(int i=0;i<ch.length;i++)
{

 if(ch[i]>='a' && ch[i]<='z')
{
  str.append((ch[i]));
}
else
{
continue;
}
	
}
System.out.print("vice verse string : "+str);
}

public static void main(String args[]){

Scanner obj=new Scanner(System.in);
System.out.print("Input the string : ");
String str=obj.nextLine();

removeCharacter(str);
}}
