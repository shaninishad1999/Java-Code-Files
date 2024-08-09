import java.util.Scanner;
class A1{

public static void add(int n1,int n2){//formal Argument
	
	int n3=n1+n2;
	System.out.println("Addition : "+n3);
	
	}	
	public static void main(String args[]){
	Scanner kb=new Scanner(System.in);
	System.out.println("Enter Number 1 : ");
	int a=kb.nextInt();
	System.out.println("Enter Number 2 : ");
	int b=kb.nextInt();
	
	add(100,200);//calling of the Addition function
	// Actual Argument
	add(a,b);
	
	
	}

	}
