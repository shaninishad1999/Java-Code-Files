import java.util.Scanner;
class ArrayR{

	public static void main(String args[]){

	int arr[]=new int[5];
	int i,sum=0,s=0;
	Scanner obj=new Scanner(System.in);
	for(i=0;i<arr.length;i++){
	
	System.out.println("Enter element index of "+i+" : ");
	arr[i]=obj.nextInt();
	
	}
	for( i=arr.length-1;i>=0;i--)
	{
	System.out.println("reverse element of "+i+" : ");	
	}
	
	
	
	
}
}