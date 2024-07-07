import java.util.Scanner;
class Task_5{
 
public static void  isNewLineStirng(String str){
	
	String[] s=str.split(" ");
 	 for(int i = 0; i < s.length; i++) {
     	
           	 System.out.println(s[i]);
     	   
    }

}
	public static void main(String args[]){
	Scanner obj=new Scanner(System.in);
	System.out.print("Enter String : ");
	String str=obj.nextLine();
	isNewLineStirng(str);
	
}
}