import java.util.Scanner;
class Fibo{
	public static void main(String args[]){

	Scanner obj=new Scanner(System.in);
	System.out.print("Enter Number : ");
	int n=obj.nextInt();
	int a=0,b=1,c=0;
	
	System.out.print("\t"+a);//0  1
	
	for(int i=1;i<=n;i++){
	a=b;
	b=c;
 	c=a+b;
	System.out.print("\t"+c);//3
	}

	
	


}
}