import java.util.Scanner;
class  Array2{

	public static void main(String args[]){

	int a[][]=new int [3][3];
	Scanner obj=new Scanner(System.in);
	System.out.print("Enter element index of 00 : ");
	a[0][0]=obj.nextInt();
	System.out.print("Enter element index of 01 : ");
	a[0][1]=obj.nextInt();
	System.out.print("Enter element index of 02 : ");
	a[0][2]=obj.nextInt();

	System.out.print("Enter element index of 10 : ");
	a[1][0]=obj.nextInt();
	System.out.print("Enter element index of 11 : ");
	a[1][1]=obj.nextInt();
	System.out.print("Enter element index of 12 : ");
	a[1][2]=obj.nextInt();

	System.out.print("Enter element index of 20 : ");
	a[2][0]=obj.nextInt();
	System.out.print("Enter element index of 21 : ");
	a[2][1]=obj.nextInt();
	System.out.print("Enter element index of 22 : ");
	a[2][2]=obj.nextInt();
	

	
	System.out.println("Output");
	System.out.println(a[0][0]+"\t"+a[0][1]+"\t"+a[0][2]);
	System.out.println(a[1][0]+"\t"+a[1][1]+"\t"+a[1][2]);
	System.out.println(a[2][0]+"\t"+a[2][1]+"\t"+a[2][2]);
}
}

	