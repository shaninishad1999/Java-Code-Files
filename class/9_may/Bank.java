import java.util.Scanner;
class Bank{

	public static void main (String args[]){

	int a,rm,n;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter Amount : ");
	a=obj.nextInt();  //1388
	
	n=a/100;  //n=13
	System.out.println(" Notes of 100 : "+n);
	rm=a-n*100;  //rm=88
	n=rm/50;  // n=1

	System.out.println(" Notes of 50 : "+n);
	rm=rm-n*50;  // rm=38
	n=rm/20;  //n=1
	System.out.println(" Notes of 20 : "+n);
	rm=rm-n*20;  //rm=18
	n=rm/10; // n=1
	System.out.println(" Notes of 10 : "+n);
	rm=rm-n*10;  //rm=8
	n=rm/5 ;  // n=1
	System.out.println(" Notes of 5 : "+n);
	rm=rm-n*5;  //rm=3
	n=rm/2;  //n=1
	System.out.println(" Notes of 2 : "+n);
	rm=rm-n*2;  //rm=1
	n=rm/1;
	System.out.println(" Notes of 1 : "+n);
	
	

}
}


