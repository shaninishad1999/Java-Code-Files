class DefaultConstructor{
	//in class data member is defined 0 or null
	//String name;  //redefine karne pr name=null
	//int age;    //age=0
	//float salary;  //salary=0.0
	
	String name;
	int age;
	float salary;
	
	public DefaultConstructor(){
	System.out.println("This is default constructor called");
	name="Ram"; 
	age=20;           
	salary=20000f; 
	}


	public void show()
	{
	System.out.println("Name = "+name);
	System.out.println("Age = "+age);
	System.out.println("Salary = "+salary);
	}

public static void main(String args[]){
	DefaultConstructor obj=new DefaultConstructor();
	obj.show();
	

}
}