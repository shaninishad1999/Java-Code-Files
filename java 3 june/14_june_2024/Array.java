import java.util.Scanner;
class Array{

	public static void main(String args[]){

	int arr[]=new int[5];
	int i,sum=0;
	Scanner obj=new Scanner(System.in);
	for(i=0;i<arr.length;i++){
	System.out.println("Enter element index of "+i+" : ");
	arr[i]=obj.nextInt();
	sum=sum+arr[i];
	
	}
	System.out.println("sum = "+sum);
	System.out.println("averarge : "+sum/arr.length);
	
}
}