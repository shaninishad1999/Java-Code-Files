import java.util.Scanner;
class A4{
	public static void main(String args[]){
	
	String arr[]=new String[5];
	int i;
	Scanner obj=new Scanner(System.in);
	for(i=0;i<arr.length;i++){
	System.out.println("Enter element of index " +i +" : ");
	arr[i]=obj.nextLine();
	}
	
	for(i=0;i<arr.length;i++){
	System.out.println("Enter element of "+ arr[i]);
	
	}
	
	
	
}
}
