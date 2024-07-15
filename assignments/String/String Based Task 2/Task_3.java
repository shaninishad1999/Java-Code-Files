import java.util.Scanner;
class Task_3{

	public static void main(String args[]){

	Scanner obj=new Scanner(System.in);
	System.out.print("Input the  string : ");
	String str=obj.nextLine();
	System.out.print("Input the position to start extraction : ");
	int n=obj.nextInt();
	
	System.out.print("Input the length of substring : ");
	int n2=obj.nextInt();
	
	
	String strNew=str.substring(n,n+n2);
	System.out.println("The substring retrieve from the string is : "+strNew);

}
}
