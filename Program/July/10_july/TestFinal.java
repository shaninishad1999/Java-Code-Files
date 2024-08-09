class TestFinal{  //final class
	final int X; //final variablee
	public TestFinal(){
	X=20;
	}


class Hello extends TestFinal{
public void show(){

System.out.println("This is Parent class show : "+X);

}
public static void main(String args[])
{
final int b=10;
Hello t=new Hello();
System.out.println("Final Local variable  : "+b);
t.show();

}
}}