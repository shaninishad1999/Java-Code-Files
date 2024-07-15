// Q5. Armstrong Number Program in Java

import java.util.Scanner;
class Task_5{
	public static void main(String args[]){
	
	int n,sum=0,digit,temp;
	Scanner shani=new Scanner(System.in);

	System.out.println("Enter Number ");
	n=shani.nextInt();  //153
	temp=n;
	while(n!=0)
	{
		digit=n%10 ;  //digit=3  //digit=5   // digit =1
		sum =sum+digit*digit*digit; //27  //125  //1
		n=n/10   ; //n=15   //n=1   //n=0
	}
	if(sum==temp)
	{
	System.out.println("Armstrong Number");
	}
	else
	{
	System.out.println("Not Armstrong Number");
	}
}
}