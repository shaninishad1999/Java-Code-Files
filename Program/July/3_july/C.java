class A{

	int x=10;
	public A(){
	System.out.println("This is A class default constructor");
	}
	public A(int x){
	this.x=x;
	System.out.println("This is A class Parameterized constructor");
}
}

class B extends A{
 int y=20;
 public B(){

	public B(){
	System.out.println("This is B class default constructor");
}
public B(int x,int y){
super(x);
this.y=y;
System.out.println("This is B class Parameterized constructor");

}
public void show(){

System.out.println("This is A class Parent X:"+x);
System.out.println("This is B class Parent X:"+y);
}

class C extends B{


int z=30;
public C(){
	
	System.out.println("This is C class default constructor");
}
public C(int x,int y,int z){
super(x,y);
this.z=z;

System.out.println("This is C class Parameterized constructor");
public  void show(){

	super.show();//to call Parent class method
	System.out.println("This is C class Parent X:"+z);
}
public static void main(String args[]){
C obj=new C(1,2,3);
obj.show();










	