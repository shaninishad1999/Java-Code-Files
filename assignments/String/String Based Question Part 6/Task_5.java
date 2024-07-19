import java.util.Scanner;

class Task_5 {
    public static void main(String args[]) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Input custom string: ");
        String str = obj.nextLine();
     StringBuilder evenChars = new StringBuilder();
        StringBuilder oddChars = new StringBuilder();
	
	char[] ch = str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
	 if(i%2==0)
	{
	evenChars.append(ch[i]);
	}
	else
	{
	oddChars.append(ch[i]);
	}
	
	}
  StringBuilder rearrangedString = evenChars.append(oddChars);
System.out.println("After = "+rearrangedString.toString());
        
    }
}
