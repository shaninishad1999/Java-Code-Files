class Test{
	// to call current class construtor
	private int rollno=1;
	private String name="Mukesh";
	private float sal=10245.65f;

	public Test(){

	System.out.println("This is default construtor");
	} 
	public Test(int roll,String n,float s)
	{

	this(); // call the current class construtor
	this.rollno=roll;
	this.name="Mukesh";
	this.sal=s;
	System.out.println("call the parametherize construtor");
	}
	public int getRollNo(){

	return rollno;
}
public String getName()
{
return name;
}
public float getSalary(){
return sal;

}

//set method for set new value of private variable
public void setRollNo(int r){

this.rollno=r;
}
public void setName(String n){

this.name=n;
}
public void setSalary(float salary)
{
this.sal=salary;
}
}
class TestMain{

public static void main(String args[]){

   Test obj=new Test(102,"jkhdf",10454.5f);
  //  obj.setRollNo(101);
  // obj.setName("Hitesh");
//obj.setSalary(10244f);
System.out.println("Name = "+obj.getName());
System.out.println("Roll No = "+obj.getRollNo());
System.out.println("Salary = "+obj.getSalary());

}

}
















