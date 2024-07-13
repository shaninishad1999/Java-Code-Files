class  Test{
	
	String name="Mai";
	int age=15;
	float salary=201450f;


	public Test(){
	System.out.println("This is default construtor");
	}


	public Test( String name ,int age){
	System.out.println("This is parametrize construtor ");
	System.out.println("Name = "+name);
	System.out.println("Age = "+age);
	}
	public Test( String n ,int ag,float s){
	name=n;
	age=ag;
	salary=s;
	System.out.println("This is parametrize construtor 2");
	System.out.println("Name = "+name);
	System.out.println("Age = "+age);
	}

	public static void show(){
	String name="Shani";
	int age=20;
	float salary =20.201f;
	System.out.println("Name = "+name);
	System.out.println("Name = "+age);
	System.out.println("Salary = "+salary);
}

public static void main(String args[]){
	Test ob=new Test("Hari",22);
	Test ob1=new Test("kirna",25,250.125f);
	
	Test obj=new Test();
	System.out.println("Name ="+obj.name);
	System.out.println("Age ="+obj.age);
	System.out.println("salary ="+obj.salary);
	obj.show();
	
	

}
}