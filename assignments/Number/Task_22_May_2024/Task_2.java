// 2. Write a program to print alternate numbers starting from 1 to 99 i.e. 1 3 5 7 9 11 13 . . . 95 97 99

class Task_2{
	public static void main(String args[]){

	int n;
	for(n=1;n<=100;n++)
	{
	if(n%2==1)
	{
	System.out.print(n+ " ");
	}
	}
}
}
