import java.util.Scanner;
class A2{
	public static void main(String args[]){

	int arr[]=new int[5];
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter element of index 0 : ");
	arr[0]=obj.nextInt();
	System.out.println("Enter element of index 1 : ");
	arr[1]=obj.nextInt();
	System.out.println("Enter element of index 2 : ");
	arr[2]=obj.nextInt();
	System.out.println("Enter element of index 3 : ");
	arr[3]=obj.nextInt();
	System.out.println("Enter element of index 4 : ");
	arr[4]=obj.nextInt();

	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	System.out.println(arr[3]);
	System.out.println(arr[4]);
	
}
}
