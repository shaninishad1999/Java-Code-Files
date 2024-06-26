import java.util.Scanner;
class   Student_Info {

	public static void main(String args[]){

	String name,a;
	char s;
	Scanner obj=new Scanner(System.in);
	
	
	System.out.println("Enter Name : ");
	name=obj.nextLine();
	System.out.println("Enter section : ");
	s=obj.next().charAt(0);
	System.out.println("Enter Address : ");
	a=obj.next();

	System.out.println("Your Name : "+name);
	System.out.println("Your Section : "+s);
	System.out.println("Your Address : "+a);





}
}