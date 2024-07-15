import java.util.Scanner;
class Task_2{
	public static void main(String args[]){
	
	String str;
	Scanner obj=new Scanner(System.in);
	System.out.print("Input the String : ");
	str=obj.nextLine();
	String str2=str;
	int c=0,s=0,k=0;
	for(int i=0;i<str.length();i++)
	{
	char ch=str.charAt(i);
	if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
	{
	c++;
	}
	else if(ch>='0' && ch<='9')
	{
	s++;
	}
	else
	{
	k++;
	}
}
	

	
	System.out.print("Number of Albhabets in the string is : "+c+"\n");
	System.out.print("Number of Digits in the string is : "+s+"\n");
	System.out.print("Number of Special characters in the string is :"+k+"\n");
	




}
}