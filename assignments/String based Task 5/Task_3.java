import java.util.Scanner;
class Task_3{
 
public static void  isLowerCaseString(String str){
	
	char ch[]=str.toCharArray();
	 for(int i = 0; i < ch.length; i++) {
        if(ch[i] >= 'A' && ch[i] <= 'Z') { 
            ch[i] = (char)(ch[i] + 32);
        }
    }
String newstr=new String(ch);
System.out.println("\nHere is the above string in lowercase :\n");
System.out.print(newstr);
}
	public static void main(String args[]){
	Scanner obj=new Scanner(System.in);
	System.out.print("Input a string in UPPERCASE : ");
	String str=obj.nextLine();
	isLowerCaseString(str);
	
}
}