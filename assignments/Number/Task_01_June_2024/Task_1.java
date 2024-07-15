

class Task_1{
	
	public static void main(String args[]){
	int digit,sum=0,range=1000,i;
	for(i=1;i<=range;i++)
	{
	int n=i;
	while(n>0)
	{
	 digit=n%10;
	sum=sum+digit*digit*digit;
	
	n=n/10;
	}
	System.out.print(sum+"\t");	
	}
}
}
	
	