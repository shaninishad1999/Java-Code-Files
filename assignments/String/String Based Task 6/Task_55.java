import java.util.Scanner;
class Task_55{

public static void main(String args[]){

	Scanner obj=new Scanner(System.in);
	System.out.print("Enter String : ");
	String str=obj.nextLine();

	 char[] chars = str.toCharArray();
   	for (int i = 0; i < chars.length - 1; i += 2) {
            	char temp = chars[i];
            	chars[i] = chars[i + 1];
           	 chars[i + 1] = temp;
        }
	System.out.println(chars);
	
}
}