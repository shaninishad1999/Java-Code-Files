class A{

	A(){
	System.out.println("Class A");
}
}
class  B extends  A{

public static void main(String args[]){
System.out.println("Class B");
A obj=new A();
C ob=new C();
}

 class C extends B{

C(){
	
System.out.println("Hello c");
}

}
}