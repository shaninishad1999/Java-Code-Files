import java.util.Scanner;
class Trangular{
	public static void main(String args[]){

	int n,i,sum=1;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter any number");
	n=obj.nextInt();
	for(i=1;i<=n;i++){
	sum+=i;
	System.out.println(i+" "+sum+" ="+(sum+i));
	

	}
	
}
}