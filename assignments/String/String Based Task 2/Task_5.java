import java.util.Scanner;
class Task_5{

	public static void main(String args[]){

	Scanner obj=new Scanner(System.in);
	System.out.print("Input the string : ");
	String str=obj.nextLine();
	String strNew[]=str.split(" ");
	int count=0;
	for(int i=0;i<strNew.length;i++)
	{
	count++;
	}
System.out.println("Number of Words : "+count);

}
}