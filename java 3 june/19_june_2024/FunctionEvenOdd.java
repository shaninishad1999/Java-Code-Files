import java.util.Scanner;
class FunctionEvenOdd{

public static void evenodd(){
	Scanner kb=new Scanner(System.in);
	System.out.println("Enter Any Number : ");
	int n=kb.nextInt();
	if(n%2==0){
		System.out.println("This is Even Number");
	}
	else{
		System.out.println("This is Odd Number");
	}
	
	}
	
	public static void main(String args[]){
	evenodd();//calling of the evenodd function
	evenodd();
	

}
}