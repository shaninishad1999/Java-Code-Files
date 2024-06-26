import java.util.Scanner;
class Function{

 public static  String isPrime(int n){

	if(n%2==0)
	{
	String s="Prime";
	return  s;
	}
	else
	{
	String k="Not Prime";
	return k ;
	}
	
		
}

	public static void main(String args[]){

	int n;
	System.out.print("Enter Any number : ");
	Scanner obj=new Scanner(System.in);
	n=obj.nextInt();
	
	System.out.print("Enter Any number : "+ isPrime(n));
}
}