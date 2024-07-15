import java.util.Scanner;
class Task_4{

	public static void main(String args[]){

	Scanner obj=new Scanner(System.in);
	System.out.print("Input the String : ");
	String str=obj.nextLine();
	
	char arr[]=str.toCharArray();
	for(int i=arr.length-1;i>=0;i--)
	{
	System.out.print(arr[i]);
	}
	
	

}
}