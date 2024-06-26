import java.util.Scanner;
class Sum{

	public static void main(String args[]){
	
	Scanner obj=new Scanner(System.in);
	int A[][]=new int[3][3];
	int B[][]=new int[3][3];
	int r,c;

	System.out.print("Enter Matrix Element A \n");
	for(r=0;r<3;r++)
	{
	for(c=0;c<3.;c++)
	{
	 System.out.print("\t");
	  A[r][c]=obj.nextInt();
	
	}
	System.out.print("\n");
	}
	

	System.out.print(" Matrix Element  \n");
	for(r=0;r<3;r++)
	{
	for(c=0;c<3.;c++)
	{
	System.out.print("\t"+A[r][c]);
	}
	System.out.println();
	}
	

	int s=0;
	
	for(r=0;r<3;r++)
	{
	for(c=0;c<1.;c++)
	{
	s=s+A[r][c];
	 
	}
	}
	System.out.print("sum of Column 1= "+s+"\n");

	s=0;
	for(r=0;r<3;r++)
	{
	for(c=1;c<2.;c++)
	{
	s=s+A[r][c];
	 
	}
	}
	System.out.print("sum of Column 2= "+s+"\n");
	s=0;
	for(r=0;r<3;r++)
	{
	for(c=2;c<3.;c++)
	{
	s=s+A[r][c];
	 
	}
	}
	System.out.print("sum of Column 3= "+s+ "\n");
	s=0;
	for(r=0;r<1;r++)
	{
	for(c=0;c<3.;c++)
	{
	s=s+A[r][c];
	 
	}
	}
	System.out.print("sum of Row 1= "+s+ "\n");
	s=0;
	for(r=1;r<2;r++)
	{
	for(c=0;c<3.;c++)
	{
	s=s+A[r][c];
	 
	}
	}
	System.out.print("sum of Row 2 = "+s+ "\n");
	s=0;
	for(r=2;r<3;r++)
	{
	for(c=0;c<3.;c++)
	{
	s=s+A[r][c];
	 
	}
	}
	System.out.print("sum of Row 3 = "+s+ "\n");
	 


}
}