import java.util.Scanner;
class Task_3{
	public static void main(String args[]){
	
	Scanner obj=new Scanner(System.in);
	System.out.print("Input the string : ");
	String str=obj.nextLine();
	int v=0,c=0;
	
	for(int i=0;i<str.length();i++)
	{
	
	char ch=str.charAt(i);
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='E' || ch=='O' || ch=='U' )
	{
	 v++;
	}
	else if(ch==' ' || ch=='.'|| ch>='0' && ch<='9')
	{
	
	}
	else
	{
	c++;
	}}
	System.out.println("The total number of vowel in the string is : "+v);
	System.out.print("The total number of consonant in the string is :"+c);

}
}