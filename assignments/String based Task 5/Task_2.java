import java.util.Scanner;
class Task_2{
 
public static void  isUpperCaseString(String str){
	
	char ch[]=str.toCharArray();
	 for(int i = 0; i < ch.length; i++) {
        if(ch[i] >= 'a' && ch[i] <= 'z') { 
            ch[i] = (char)(ch[i] - 32);
        }
    }
String newstr=new String(ch);
System.out.println("Here is the above string in UPPERCASE :");
System.out.print(newstr);
}
	public static void main(String args[]){
	Scanner obj=new Scanner(System.in);
	System.out.print("Input a string in lowercase : ");
	String str=obj.nextLine();
	isUpperCaseString(str);
	
}
}