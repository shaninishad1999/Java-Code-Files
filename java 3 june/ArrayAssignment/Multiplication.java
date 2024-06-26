import java.util.Scanner;
class Multiplication{

	public static void main(String args[]){
	
	Scanner obj=new Scanner(System.in);
	int A[][]=new int[3][3];
	int B[][]=new int[3][3];
	int C[][]=new int[3][3];
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
	
	System.out.print("Enter Matrix Element B \n");
	for(r=0;r<3;r++)
	{
	for(c=0;c<3.;c++)
	{
	System.out.print("\t");
	  B[r][c]=obj.nextInt();
	}
	System.out.println();
	}

System.out.print(" Matrix Element A \n");
	for(r=0;r<3;r++)
	{
	for(c=0;c<3.;c++)
	{
	System.out.print("\t"+A[r][c]);
	}
	System.out.println();
	}
	
	System.out.print(" Matrix Element B \n");
	for(r=0;r<3;r++)
	{
	for(c=0;c<3.;c++)
	{
	System.out.print("\t"+B[r][c]);
	}
	System.out.println();
	}




	System.out.print("Multiplication of Matrix  A X B : \n");
	for(r=0;r<3;r++){
	      for(c=0;c<3;c++){
		for(int k=0;k<3;k++)
	{
	C[r][c]=A[r][k]*B[k][c];
	}
	}
	}

	for(r=0;r<3;r++)
	{
	for(c=0;c<3.;c++)
	{
	
	 System.out.print("\t"+C[r][c]);
	}
	System.out.println();
	}
	
	 


}
}