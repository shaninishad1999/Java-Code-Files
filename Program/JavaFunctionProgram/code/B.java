class B{

private int rollno=10;
private String name="Hari";
private float sal=10.2415f;

public int getRollNo(){
return rollno;
}
public String getName(){
return name;
}
public float getSalary(){
return sal;
}

public int setRollNo(int rollno){
rollno=rollno;
return rollno;
}
public String setName(String name){
name=name;
return name;
}
public float setSalary(float sal){
sal=sal;
return sal;
}
}
Class T1{
public static void main(String args[]){
 B obj=new B();
	obj.setRollNo(101);
	obj.setName("Suman");
	obj.setSalary(102145.45f);
System.out.println("Name = "+obj.getRollNo());
System.out.println("Name = "+obj.getName());
System.out.println("Name = "+obj.getSalary());
}}
