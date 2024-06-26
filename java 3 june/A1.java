import java.util.Scanner;
class A2{

	public static void main(String args[]){
	
	int  arr[][]=new int[3][3] ;
	int r,c;
	Scanner obj=new Scanner(System.in);
	for(r=0;r<3;r++)
	{
                    for(c=0;c<3;c++)
	    {
	System.out.print("Enter element index of "+r+c+" : \n");
	 arr[r][c]=obj.nextInt();
	}
	}
	
	System.out.println("Array elements are : ");
	
 	for(r=0;r<3;r++)
	{
                    for(c=0;c<3;c++)
	    {
	System.out.print("\t "+arr[r][c]);
	 
	}
	System.out.println("");
	}


}
}