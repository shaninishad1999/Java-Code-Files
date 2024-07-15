import java.util.Scanner;
class Task_2_2{
	public static void main(String args[]){
	Scanner obj=new Scanner(System.in);
	System.out.print("m = ");
	int m=obj.nextInt();
	System.out.print("n= ");
	int n=obj.nextInt();
	int count=0,digit,sum=0,temp;
	
	if(m<n)
	{
	System.out.println("The composite magic numbers are : \n");
	for(int i=m; i<=n;i++)
	{
	temp=i;
	
	while (temp != 0)
	 {
	digit = temp % 10;
	sum = sum + digit;
	temp = temp / 10;
	}
	int s = 0, d;
	while (sum != 0) {
	d = sum % 10;
	s += d;
	sum /= 10;
	}
	
	if (s == 1) {
	System.out.print(i+"\t");
	count++;
	
	}
	}
	System.out.println("\n\nFrequency of composite magic numbers: "+count + "\n");
	}
	else
	{
	System.out.println("Invlid Input");
	}
	
}
}