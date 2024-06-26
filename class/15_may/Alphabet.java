import java.util.Scanner;
class   Alphabet{

	public static void main(String args[]){
	char ch;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter Character : ");
	ch=obj.next().charAt(0);
	if(ch=='a' ||ch=='e' || ch=='i' ||ch=='o' ||ch=='u' || ch=='A' ||ch=='E' ||ch=='E' ||ch=='O' || ch=='U' )
	{
	System.out.println("Vowel ");
	}
	else
	{
	System.out.println("Consonents ");
	}



}
}