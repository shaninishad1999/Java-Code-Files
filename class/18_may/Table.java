import java.util.Scanner;
class Table{

	public static void main(String args[]){

	int  x,i=1;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter Any number : ");
	x=obj.nextInt();
	// for(i=1;i<=10;i++)
	// {
	// System.out.println("Table : "+(x*i));
	// }

	// do{
	// System.out.println("Table : "+(x*i));
	// i++;
	// }while(i<=10);

	while(i<=10){
	System.out.println("Table : "+(x*i));
	 i++;
	}


	
	


}
}