import java.util.Scanner;
class EmpInfo{

public void getData(){

String name;
String job;
float bsal;
int deptno;

Scanner obj=new Scanner(System.in);
System.out.print("Enter Name = ");
name=obj.nextLine();
System.out.print("Enter job = ");
job=obj.nextLine();
System.out.print("Enter bsal = ");
bsal=obj.nextInt();
System.out.print("Enter deptno = ");
deptno=obj.nextInt();

}
public void showData(){
System.out.println("Your Name = "+name);
System.out.println("Your Job = "+job);
System.out.println("Your Bsal = "+bsal);
System.out.println("Your DeptNo = "+deptno);
}
public double getHRA(){

return 20;
}
public double getDA(){
return 
}
public double getTA(){

}
public double toalIncentive(){

}


public static void main(String args[]){

EmpInfo obj=new EmpInfo();
obj.getData();
obj.showData();

}
}