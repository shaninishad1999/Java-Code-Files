import java.util.Scanner;
class Table{

	public static void main (String args[]){
	System.out.println(" while Loop");
	int x=1;
	
	while(x<=60)
	{
	if(x%3==0 && x%5==0)
	{
	System.out.println("====> x =" +x);
	}x++;
	}
	//for loop
	System.out.println(" for Loop");
	int i;
	for(i=1;i<=60;i++)
	{
	if(i%3==0 && i%5==0)
	{
	System.out.println("====> i =" +i);
	}
	}
	System.out.println(" do while Loop");
	int a=1;
	do{
	if(a%3==0 && a%5==0)
	{
	System.out.println("====> a =" +a);
	}
	a++;
	}while(a<=60);
	


}
}