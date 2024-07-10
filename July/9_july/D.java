class D{
	D(){

	System.out.println("Default constructor class D");
	}

static class A{

	A(){

	System.out.println("Default constructor class A");
	}

}
static class B{
B(){

System.out.println("Default constructor class B");
}
}
 static class C{
C(){

System.out.println("Default constructor class C");
}
}

public static void main(String args[]){
System.out.println("Class D");
A a=new A();
B b=new B();
C c=new C();
D d=new D();

}
}
