
class  SortedArrayAscending{

	public static void main(String args[]){

	int i,j,temp;
	int arr[]={50,10,30,450,12,98,100};
	System.out.println("Before Sorted");
	for(i=0;i<arr.length;i++)
	{
	System.out.println(arr[i]);
	}

	for(i=0;i<arr.length;i++)
	{	
	for(j=i+1;j<arr.length;j++)
	{
	if(arr[i]>arr[j])
	{
	temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	}
	}	
}
System.out.println("\nAter sorting");
	for(i=0;i<arr.length;i++)
	{
	System.out.println(arr[i]);
	}



}
}
