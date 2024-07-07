import java.util.Scanner;
class Geeks {

	public static void main(String args[]){
	float a,b;
	Scanner obj=new Scanner(System.in);
	

	System.out.printf("a = ");
	a=obj.nextFloat();
	System.out.printf("b =  ");
	b=obj.nextFloat();
	float result=a/b;
	System.out.printf("%.7f",result );

}
}