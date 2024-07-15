//import java.util.Scanner;
class Task_2{
	public static void main(String args[]){
	int n=20;
	//Scanner sc=new Scanner(System.in);
	// System.out.println("");
	for(int i=1; i<=n;i++)
	{
	if(i%2==0 || i%3==0 || i%5==0)
	{
	System.out.print(i+"\t");
	i++;	
	}
	}

}

}