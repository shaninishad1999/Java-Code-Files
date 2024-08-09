class Const{

	Const(){
	System.out.println("Default Constructor");
	}
	
	Const(String name,int age){
		System.out.println("Parameter Constructor");
	 name="shani";
	age=22;
	System.out.println("Name = "+name);
	System.out.println("age = "+age);
	}


public static void main(String args[]){

Const obj=new Const();
Const o=new Const("S",55);



}}