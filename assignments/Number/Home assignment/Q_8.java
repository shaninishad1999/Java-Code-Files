import java.util.Scanner;
class Q_8{

	public static void main(String args[]){

	int n,a=1;
	Scanner shani=new Scanner(System.in);
	System.out.printf("Input number of terms is : ");
	n=shani.nextInt();
		
	
	System.out.println("The odd numbers are : ");
	do{
	if(a%2==1)
	{
	System.out.println(a);
	System.out.println("The Sum of odd Natural Number upto 5 terms is: ");
	}
	a++;
	}while(a<=n);
	

	
}
}