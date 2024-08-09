import java.util.Scanner;
class A4{
	public static void main(String args[]){
	
	int arr[]=new int[5];
	Scanner obj=new Scanner(System.in);
	int i;
	for(i=0;i<arr.length;i++)
	{
	System.out.print("Enter element index of  "+i+ " : ");
	arr[i]=obj.nextInt();
	} //input
	System.out.println("Store array");
	for(i=0;i<arr.length;i++)
	{
	System.out.println(arr[i]);
	
	} //output
	


}
}
