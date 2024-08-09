class Test{
private int rollno=10;  //instance variable
private float per=78.50f; //instace variable
private String name="Akash"; // instance varaible

//getter method in Encapsulation

public int  getRollNo(){
return rollno;
}
public float getPer(){
return per; 
} 
public String getName(){
return name;
} 
}
public class Encaps{
	public static void main(String args[]){
	Test t=new Test();
	System.out.println(t.getRollNo());
	System.out.println(t.getPer());
	System.out.println(t.getName());
}
}



