class EmpP{
	String name;
	float sal;
	int deptno;
   public Emp(){
	System.out.println("Default constructor is called 1");
	name=n;
	 sal=;
	deptno=;
	}

   public Emp(String n,float s,int d){
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

	Emp e=new Emp("Ram",54455,10);
	e.showData();
	Emp e1=new Emp("Shyam",58446,20);
	e1.showData();
	Emp e2=new Emp("hari",515465,30);
	e2.showData();
}
}