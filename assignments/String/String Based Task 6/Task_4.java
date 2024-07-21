import java.util.Scanner;

class Task_4 {

	public static void main(String args[]){

	
	Scanner obj=new Scanner(System.in);

	System.out.print("Input : str = ");
	String str=obj.nextLine();
	StringBuffer st=new StringBuffer();
	
	 st.insert(0, '[');
	st.append(str);
	st.append(']');
	System.out.println(st);



}
}