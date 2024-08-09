import java.util.Scanner;

class   Circle{

	public static void main(String args[]){

	Scanner obj=new Scanner(System.in);
	float r,ar,cr;

	System.out.println("Enter radius: ");
	r=obj.nextFloat();
	
	ar=3.14f*r*r;
	cr=2*3.14f*r;
	System.out.println("Area : "+ar);
	System.out.println("Crumference : "+cr);
	





}
}