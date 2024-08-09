class EmpP{
	String name;
	float sal;
	int deptno;
   public EmpP(){
	System.out.println("Default constructor is called 1");
	name=n;
	 sal=s;
	deptno=d;
	}

   public EmpP(String n,float s,int d){
	System.out.println("Paramerise constructor is called 1");
	name=n;
	 sal=s;
	deptno=d;
	}

public void showData(){
System.out.println("Name : "+name);
System.out.println("Sal : "+sal);
System.out.println("DPt : "+deptno);
}



public static void main(String args[]){

	EmpP e=new EmpP("Ram",54455,10);
	e.showData();
	EmpP e1=new EmpP("Shyam",58446,20);
	e1.showData();
	EmpP e2=new EmpP("hari",515465,30);
	e2.showData();
}
}