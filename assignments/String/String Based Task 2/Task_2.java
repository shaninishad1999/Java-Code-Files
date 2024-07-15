import java.util.Scanner;
class Task_2{

	public static void main(String args[]){

	Scanner obj=new Scanner(System.in);
	int n=10;
	System.out.println("Enter 10 Names : ");
	String[] str=new String[n];

	for(int i=0;i<n;i++)
	{
	  str[i]=obj.nextLine();
	}
	System.out.println("\nPrinted name contains he \n");
	for(int i=0;i<n;i++)
	{
	if(str[i].contains("he"))
	{
	System.out.print(str[i]+"\t");
	}
	}
	


}
}