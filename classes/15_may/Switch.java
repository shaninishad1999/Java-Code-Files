import java.util.Scanner;
class   Switch{

	public static void main(String args[]){
	char ch;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter Character : ");
	ch=obj.next().charAt(0);

	switch(ch){
	case 'a':
	case 'A':
	{
                       System.out.println("Vowel");
	        break;
	}
	case 'e':
	case 'E':
	{
                       System.out.println("Vowel");
	        break;
	}
	case 'i':
	case 'I':
	{
                       System.out.println("Vowel");
	        break;
	}
	case 'o':
	case 'O':
	{
                       System.out.println("Vowel");
	        break;
	}
	case 'u':
	case 'U':
	{
                       System.out.println("Vowel");
	        break;
	}
	default:
	{
	
                       System.out.println("Consonents");
	       
	}
}

}
}