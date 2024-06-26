import java.util.Scanner;
class A3{

	public static void main(String args[]){
	
	int  arr[][]=new int[3][3] ;
	int  a[][]=new int[3][3] ;
	//int c[][]=new int [3][3];
	
	int r,c;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter matrix Arr ");
	for(r=0;r<3;r++)
	{
                    for(c=0;c<3;c++)
	    {
	System.out.print("Enter element index of "+r+c+" : \n");
	 arr[r][c]=obj.nextInt();
	}
	}
	
	System.out.println("enter matrix b ");
	for(r=0;r<3;r++)
	{
                    for(c=0;c<3;c++)
	    {
	System.out.print("Enter element index of "+r+c+" : \n");
	 a[r][c]=obj.nextInt();
	}
	}

	System.out.println("Array elements are  matrix 1: ");
 	for(r=0;r<3;r++)
	{
                    for(c=0;c<3;c++)
	    {
	System.out.print("\t "+arr[r][c]);
	 
	}
	System.out.println("");
	}
	System.out.println("Array elements are  matrix 2: ");
 	for(r=0;r<3;r++)
	{
                    for(c=0;c<3;c++)
	    {
	System.out.print("\t "+a[r][c]);
	 
	}
	System.out.println("");
	}

System.out.println("sum matrix: ");
 	for( r=0;r<3;r++)
	{
                    for( c=0;c<3;c++)
	    {
	System.out.print("\t "+arr[r][c]+a[r][c]);
	 
	}
	System.out.println("");
	}


}
}