import java.util.Scanner;
class Task_2{

public static void main(String[] args){

Scanner obj=new Scanner(System.in);
System.out.print("Enter Strng : ");
String str=obj.nextLine();

StringBuffer s=new StringBuffer();

char[] ch=str.toCharArray();

for(int i=0;i<ch.length;i++)
{
if(ch[i]=='0')
{
continue;
}
else
{
s.append(ch[i]);
}
}
System.out.println(s.toString());
}
}