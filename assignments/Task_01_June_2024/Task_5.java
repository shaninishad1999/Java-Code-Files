import java.util.Scanner;

class Task_5{
	
	public static void main(String args[]){
	
	int cp,sp;
	Scanner sc=new Scanner(System.in);
	System.out.print("CP = ");
	cp=sc.nextInt();
	System.out.print("SP = ");
	sp=sc.nextInt();
	
	int  Loss = cp-sp;
	 int Profit = sp-cp;
	 if (Profit> 0)
    	{
     	   System.out.print("Profit : "+Profit);
    	}
    	else if (Profit < 0)
   	 {
    	    System.out.println("Lose :"+Loss);
  	  }
  	

}
}

