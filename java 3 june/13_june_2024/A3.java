import java.util.Scanner;
class A3{
	public static void main(String args[]){
	
	int arr[]=new int[5];
	int i;
	Scanner obj=new Scanner(System.in);
	for(i=0;i<arr.length;i++){
	System.out.println("Enter element of index " +i +" : ");
	arr[i]=obj.nextInt();
	}
	
	for(i=0;i<arr.length;i++){
	System.out.println("Enter element of "+ arr[i]);
	
	}
	
	
	
}
}
