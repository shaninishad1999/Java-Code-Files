 interface Ia{
int x=10;
 void a();

 }

 interface Ib{
int y=20;
 void b();

 } 

interface IC extends Ia,Ib{
int z=30;
 void c();
}

class Test implements IC{

 public void a(){
	System.out.println("Ia INterface method : "+x);
 }
public void b(){
	System.out.println("Ib INterface method : "+y);
 }
public void c(){
	System.out.println("Ic INterface method : "+z);
 }

	public void hello(){
	System.out.println("This is Test class Method");
	}
  public static void main(String args[]){
	//Ia obj=new Ia();//C.E.
	Ia obj=new Test();
	obj.a();
	//obj.hello();
	Test t=new Test();
	t.hello();
	t.a();
	t.b();
	t.c();
	//t.x=22;
	 }
}

