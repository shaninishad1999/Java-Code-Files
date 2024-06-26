import java.util.Scanner;
class A5{
	public static void main(String args[]){
	
	String arr[]=new String[5];
	Scanner obj=new Scanner(System.in);
	int i;
	for(i=0;i<arr.length;i++)
	{
	System.out.print("Enter element index of  "+i+ " : ");
	arr[i]=obj.nextLine();
	} //input
	System.out.println("Store array");
	for(i=0;i<arr.length;i++)
	{
	System.out.println(arr[i]);
	
	} //output
	


}
}
