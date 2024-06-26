import java.util.Scanner;
class NewSum{

	public static void main(String args[]){
	
	Scanner obj=new Scanner(System.in);
	int A[][]=new int[3][3];
	
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

	int a=0,b=0,d=0,e=0,k=0;
	for(r=0;r<3;r++)
	{
	for(c=0;c<3.;c++)
	{
	if(c==0)
	{
	s=s+A[r][c];
	}
	if(c==1)
	{
	a=a+A[r][c];
	}
	 if(c==2 )
	{
	b=b+A[r][c];
	}
	if(r==0 )
	{
	k=k+A[r][c];
	}
	if(r==1 )
	{
	d=d+A[r][c];
	}
	if(r==2)
	{
	e=e+A[r][c];
	}
	}
	}
	System.out.print("sum of Column 1= "+s+"\n"); 
	System.out.print("sum of Column 2= "+a+"\n"); 
	System.out.print("sum of Column 3= "+b+"\n"); 

	System.out.print("sum of Row 1= "+k+ "\n");
	System.out.print("sum of Row 2= "+d+ "\n");
	System.out.print("sum of Row 3= "+e+ "\n");


}
}