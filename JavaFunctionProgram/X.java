abstract  class X{
	
	public static void issum(int a,int b)
	{
	
		System.out.println("Sum= "+(a+b));
	}
	abstract void display();

class B extends X{

   int x=5,y=5;
	public void display(){
issum(x,y);
}

}

public static void main(String args[]){
 X obj=new B();

}

}
