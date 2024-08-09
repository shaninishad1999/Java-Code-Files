class  Task_1{

	public static void main(String args[]){

	
	int arr[]={2000,50,100,5000,300,600};
	int max1=arr[0];
	int max2=max1;

	for(int i=0;i<arr.length;i++)
	{
	if(arr[i]>max1)
	{
	max2=max1;
	max1=arr[i];
	
	}
	 if(arr[i]>max2 && arr[i]<max1)
	{
	max2=arr[i];
	}
	}
	System.out.println("Max value 1 = "+max1);
	System.out.println("Max Value 2 = "+max2);
	


}
}