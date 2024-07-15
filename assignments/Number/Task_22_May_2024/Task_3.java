// 3. Write a program to print alternate numbers starting from 0 to 100 i.e. 0 2 4 6 8 10 12 . . . 96 98 100

class Task_3{
	public static void main(String args[]){

	int n;
	for(n=0;n<=100;n++)
	{
	if(n%2==0)
	{
	System.out.print(n+ " ");
	}
	}
}
}