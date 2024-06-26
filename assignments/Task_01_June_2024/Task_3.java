import java.util.Scanner;
class Task_3{

	public static void main (String args[]){	
	
	float s,l,b,h,ar,w,r;
	Scanner sc=new Scanner(System.in);

	System.out.println("1- Area of Right Triangle ");
	System.out.println("2- Area of Equilateral Triangle ");
	 System.out.println("3- Area of Square ");
	System.out.println("4- Area of Rectangle ");
	System.out.println("5- Area of Circle ");

	System.out.print("Select your choice = ");
	int c=sc.nextInt();
	
	

	switch(c){
	
	case 1:
	System.out.print("Enter b = ");
	b=sc.nextFloat();
	System.out.print("Enter h = ");
	h=sc.nextFloat();
	ar=1.0f/2*b*h;
	System.out.println("Area of Right Triangle : "+ ar);
	break;
	
	case 2:
	System.out.print("Enter s = ");
	 s=sc.nextFloat();
	 ar=1.732f/4*s*s;
	System.out.println("Area of Equilateral Triangle : "+ (ar));
	break;
	
	case 3:
	System.out.print("Enter s = ");
	 s=sc.nextFloat();
	System.out.print("Area of Square : "+ (s*s));
	break;
	
	case 4:
	System.out.print("Enter l = ");
	l=sc.nextFloat();
	System.out.print("Enter b = ");
	 b=sc.nextFloat();
	System.out.print(" Area of Rectangle : "+ (l*b));
	break;
	
	case 5:
	System.out.print("Enter r = ");
	 r=sc.nextFloat();
	System.out.print("Area of Circle : "+ (3.14f*r*r));
	break;
	default:
	System.out.println("Enter valid input");
	}
}
}
	
	