class  A2{

	public static void main(String args[]){

	int arr[]={40,500,30,100,20};
	
	for(int i=0;i<arr.length;i++)
	{
	 if(arr[i]>arr[i+1])
	{
	int temp=arr[i];
	 arr[i]=arr[i+1];
	arr[i]=temp;
	System.out.println(arr[i]);
	}
	
	}

}
}