class ParameterizeConstructor{
	//in class data member is defined 0 or null
	//String name;  //redefine karne pr name=null
	//int age;    //age=0
	//float salary;  //salary=0.0
	
	String name;
	int age;
	float salary;
	
	public ParameterizeConstructor(String s,int n,float sal){

	System.out.println("This is Parameterize constructor called");
	 name=s;
	 age=n;
	salary=sal;	
	}


	public void show()
	{
	System.out.println("Name = "+name);
	System.out.println("Age = "+age);
	System.out.println("Salary = "+salary);
	}

public static void main(String args[]){
	ParameterizeConstructor obj=new ParameterizeConstructor("Ram",20,2000.50f);
	obj.show();
	

}
}