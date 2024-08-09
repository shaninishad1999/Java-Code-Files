import java.util.Scanner;
class A19{
	public static void main(String args[]){

	int A[][]=new int[3][3];
	int B[][]=new int[3][3];
	int C[][]=new int[3][3];
	Scanner obj=new Scanner(System.in);
	int r,c;
	System.out.println("Array Elements A : ");
	for(r=0;r<3;r++)
	{
	  for(c=0;c<3;c++)
	  {
	   A[r][c]=obj.nextInt();
	}
	}
	System.out.println("Array Elements B : ");
	for(r=0;r<3;r++)
	{
	  for(c=0;c<3;c++)
	  {
	   B[r][c]=obj.nextInt();
	}
	}


	System.out.println("Array Elements A : ");
	for(r=0;r<3;r++)
	{
	  for(c=0;c<3;c++)
	  {
	   System.out.print("\t"+A[r][c]);
	}
	System.out.println(" ");
	}
	System.out.println("Array Elements B : ");
	for(r=0;r<3;r++)
	{
	  for(c=0;c<3;c++)
	  {
	   System.out.print("\t"+B[r][c]);
	}
	System.out.println(" ");
	}

	//addition of matrix
	for(r=0;r<3;r++)
	{
	  for(c=0;c<3;c++)
	  {
	   C[r][c]=A[r][c]+B[r][c];
	}
	
	}
	
	
	
	System.out.println("Sum of matrix : ");
	for(r=0;r<3;r++)
	{
	  for(c=0;c<3;c++)
	  {
	    System.out.print("\t"+C[r][c]);
	}
	System.out.println(" ");
	}
}
}