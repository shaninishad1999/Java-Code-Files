import java.util.Scanner;
class swap{

public static void swp(int x,int y){

  int temp=x;
     x=y;
   y=temp;
System.out.println("m ="+x);
System.out.println("n = "+y);
}

public static void main(String args[]){

    Scanner obj=new Scanner(System.in);
	System.out.println("Enter two number ");
	int m=obj.nextInt();
	int n=obj.nextInt();
	swp(m,n);
	}
}