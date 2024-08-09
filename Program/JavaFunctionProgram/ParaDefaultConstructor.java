class ParaDefaultConstructor{
	//in class data member is defined 0 or null
	//String name;  //redefine karne pr name=null
	//int age;    //age=0
	//float salary;  //salary=0.0
	

//note only called parametrize constructor


	String name;
	int age;
	float salary;
	
	public ParaDefaultConstructor(){
	System.out.println("This is defualt constructor automatic  called");
	 name="Hari";
	age=25;
	salary=20142.052f;
	}

	public ParaDefaultConstructor(String s,int n,float sal){

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
	ParaDefaultConstructor obj=new ParaDefaultConstructor("Ram",20,2000.50f);
	obj.show();
	ParaDefaultConstructor o=new ParaDefaultConstructor("Mohan",21,2200.50f);
	o.show();
	ParaDefaultConstructor ob=new ParaDefaultConstructor("Rohan",23,2200.50f);
	ob.show();

}
}