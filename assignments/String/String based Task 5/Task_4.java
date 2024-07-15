import java.util.Scanner;
class Task_4{
 
public static void  isSpecialCharacter(String str,char c){
	
	char ch[]=str.toCharArray();
	 for(int i = 0; i < ch.length; i++) {
     	   if(ch[i] ==' ') { 
	 ch[i]=c;
            
     	   }
    }
String newstr=new String(ch);
System.out.print(newstr);
}
	public static void main(String args[]){
	Scanner obj=new Scanner(System.in);
	System.out.print("Enter String : ");
	String str=obj.nextLine();
	System.out.print("Input replace character : ");
	char ch=obj.next().charAt(0);
	isSpecialCharacter(str,ch);
	
}
}