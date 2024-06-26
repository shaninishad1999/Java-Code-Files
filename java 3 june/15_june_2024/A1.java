class  A1{

	public static void main(String args[]){

	
	int arr[]={1000,200,20,100,50,500};
	int max=arr[0];
	int min=arr[0];

	for(int i=0;i<arr.length;i++)
	{
	if(arr[i]>max)
	{
	max=arr[i];
	}
	if(arr[i]<min)
	{
	min=arr[i];
	}
	}
	System.out.println("Max value = "+max);
	System.out.println("Min Value = "+min);
	


}
}