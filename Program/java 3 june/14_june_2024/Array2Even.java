import java.util.Scanner;
class Array2Even{

	public static void main(String args[]){

	int arr[]=new int[5];
	int i,sum=0,s=0;
	Scanner obj=new Scanner(System.in);
	for(i=0;i<arr.length;i++){
	
	System.out.println("Enter element index of "+i+" : ");
	arr[i]=obj.nextInt();
	if(arr[i]%2==0)
	{
	sum=sum+arr[i];
	}
	else{
	s=s+arr[i];	
	}
	}
	System.out.println("even sum = "+sum);
	System.out.println("odd sum = "+s);
	
	
}
}