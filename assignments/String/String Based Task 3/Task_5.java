import java.util.Scanner;
class Task_5{
	public static void main(String args[]){
	
	Scanner obj=new Scanner(System.in);
	System.out.print("Input the string : ");
	String str=obj.nextLine();
	char[] ch=str.toCharArray();
	char temp;
	for(int i=0;i<ch.length;i++)
	{
	for(int j=i+1; j<ch.length-i-1;j++)
	{
	if(ch[i]<ch[j+1])
	{
	temp=ch[j+1];
	ch[j+1]=ch[j];
	ch[j]=temp;
	}
	}
}
 for (int i = 0; i < ch.length; i++)
    {
        System.out.print(ch[i]);
    }


}
}