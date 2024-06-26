import java.util.Scanner;
public class Task_3 {

    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter String \n");
        String str=obj.nextLine();


        if (str.length()>=5 ) {
	for(int i=0;i<str.length();i++)
	{
	char ch=str.charAt(i);
	if(ch>='0' && ch<='9'){
	 System.out.print(ch);
	
	}
	else
	{
	System.out.println("Error");
	break;
	
	}
	}

          
           } 
        else
        {
            System.out.println("Error");
        }

    }
    
}
