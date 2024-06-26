import java.util.Scanner;
class Task_4{

	public static void main(String args[]){

	int m,e,s,a,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter marks out of 100");
	System.out.print("Enter marks of math = ");
	 m=sc.nextInt();
	System.out.print("Enter marks of English = ");
	 e=sc.nextInt();
	System.out.print("Enter marks of Science = ");
	 s=sc.nextInt();
	System.out.print("Enter marks of Art = ");
	 a=sc.nextInt();
	System.out.print("Enter marks of Computer = ");
	 c=sc.nextInt();

	System.out.print(" Total marks out of 500= "+(m+e+s+a+c));
	System.out.print("\n Percent of marks = "+(m+e+s+a+c)/5);
}
}