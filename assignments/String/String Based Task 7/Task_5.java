import java.util.Scanner;

class Task_5 {
public static void main(String args[]){
  	
	Scanner obj=new Scanner(System.in);
	System.out.print("Enter String : ");
	String str=obj.nextLine();
	   boolean[] mark = new boolean[26];
 
	char[] ch=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
	if(ch[i]>='a' && ch[i]<='z')
	{
	   index = str.charAt(i) - 'a';
	}
	else{

                continue;
            mark[index] = true;

}
	}
 for (int i = 0; i <= 25; i++)
            if (mark[i] == false)
                return (false);
 
        // If all characters were present
        return (true);
    }

}
}