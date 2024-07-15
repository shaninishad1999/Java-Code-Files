import java.util.Scanner;
class Task_1{

	public static void main(String args[]){
	
	Scanner obj=new Scanner(System.in);
	
	System.out.println("Enter 10  Names : ");
	int n=10;
	//obj.nextLine();
	String[] str=new String[n];

	for(int i=0;i<n;i++)
	{
	  str[i]=obj.nextLine();
	}
	System.out.println("Printed Name Stat with H or h ");
	for(int i=0;i<n;i++)
	{
	if(str[i].toLowerCase().startsWith("h"))
	{
	System.out.print(str[i]+"\t");	
	}
	}
	
	
}
}