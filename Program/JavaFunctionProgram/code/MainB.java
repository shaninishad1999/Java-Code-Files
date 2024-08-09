class AB{

	static{

	System.out.println("This is parent class");
}
}
class B extends AB{

	static{

	System.out.println("This is child class ");
}
}
class Bc extends B{

	static{

	System.out.println("This is subchild class ");
}
}
class MainB extends Bc{
	public static void main(String args[]){
	AB obj=new AB();
System.out.println("This main method");
}
}
