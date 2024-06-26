import java.util.Scanner;
class Task_8{
	public static void main(String args[]){
	int wages,days;
	Scanner sc=new Scanner(System.in);
	System.out.print("Sample Input : ");
	wages=sc.nextInt();
	days=sc.nextInt();
	int B_pay=wages*10;
	System.out.println("Basic Pay : "+B_pay);
	System.out.println("DA : "+B_pay*5/100 +"   HRA : "+B_pay*10/100);
	System.out.println("PF : "+B_pay*12/100);

}
}