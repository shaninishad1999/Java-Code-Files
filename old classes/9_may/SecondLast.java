import java.util.Scanner;
class SecondLast{

	public static void main(String args[]) {

	int number;
	Scanner obj=new Scanner(System.in);
	System.out.print("Enter 4 digit Number : " );
	number=obj.nextInt();
		//1234
	number=number%1000;   //234
	number=number%100;   //34
	number=number/10;  // 3
	
System.out.print("Second Last digit : "+number);
}
}
	
	
