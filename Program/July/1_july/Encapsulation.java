class Test{

private String name="Shanideval";
private int rollno=101;
private float sal=10000.25f;

//getter method  && set method

public String getName(){
return name;
}
public int getRollNo(){
return rollno;
}
public float getSal(){
return sal;
}

//set method
public void setName(String name){
this.name=name;
}
public void setRollNo(int rollno){
this.rollno=rollno;
}
public void setSal(float sal){
this.sal=sal;
}
}
class Encapsulation{

	public static void main(String args[]){
	Test t=new Test();

	t.setName("Hari");
	t.setRollNo(10);
	t.setSal(14521.02f);
	System.out.println(t.getName());
	System.out.println(t.getRollNo());
	System.out.println(t.getSal());
	


}	
}