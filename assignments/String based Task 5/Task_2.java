import java.util.Scanner;
class Task_2{
 
public static void  isUpperCaseString(String str){
	StringBuilder s=new StringBuilder();
	char[] ch=str.toCharArray();
	for(int i=0;i<ch.length; i++)
	{
	if(ch[i]>='a' && ch[i]<='z')
	{
	s.append(str);
	}
	}
	System.out.print(s);

}
	public static void main(String args[]){
	Scanner obj=new Scanner(System.in);
	System.out.print("Enter String : ");
	String str=obj.nextLine();
	isUpperCaseString(str);
	
}
}