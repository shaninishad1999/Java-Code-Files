import java.util.Scanner;

class Task_2 {
    public static void main(String args[]) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Input custom string: ");
        String str = obj.nextLine();
        StringBuffer st = new StringBuffer();

	for(int i=0;i<str.length();i++)
	{
	
	st.append(str.charAt(i));
	st.append(" ");
	
	}
System.out.println("After = "+st.toString());
        
    }
}
