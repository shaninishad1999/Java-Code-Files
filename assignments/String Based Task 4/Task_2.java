import java.util.Scanner;
class Task_2{

public static void isReplace(String s){

char[] ch=s.toCharArray();
StringBuilder str=new StringBuilder();

 for(int i=0;i<ch.length;i++)
{

 if(ch[i]>='a' && ch[i]<='z')
{
  str.append(Character.toUpperCase(ch[i]));
}
else
{
str.append(Character.toLowerCase(ch[i]));
}
	
}
System.out.print("vice verse string : "+str);

}

public static void main(String args[]){

Scanner obj=new Scanner(System.in);
System.out.print("Enter String : ");
String str=obj.nextLine();
isReplace(str);


}
}