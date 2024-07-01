class Emp{
	String name;
	float sal;
	int deptno;
   public Emp(){
	System.out.println("Default constructor is called 1");
	name="guest";
	 sal=100;
	deptno=10;
	}
public void showData(){
System.out.println("Name : "+name);
System.out.println("Sal : "+sal);
System.out.println("DPt : "+deptno);
}



public static void main(String args[]){

	Emp e=new Emp();
	e.showData();
	Emp e1=new Emp();
	e1.showData();
	Emp e2=new Emp();
	e2.showData();
}
}