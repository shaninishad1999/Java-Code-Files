class A{

	private int rollno=10;
	private String name="Shani";
	private float sal=101010.50f;

	public int getRollNo(){
	return rollno;
}
	public String getName(){
	return name;

	}
	public float getSalary(){
	return sal;
}


public static void main(String args[]){
 A  obj=new A();
  System.out.println("RollNumber = " + obj.getRollNo());
        System.out.println("Name = " + obj.getName());
        System.out.println("Salary = " + obj.getSalary());
}
}