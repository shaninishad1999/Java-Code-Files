import java.util.Scanner;
class ExamClass{

String name;
int age;
float sal;
int deptno;


public  void getInput(){
Scanner obj=new Scanner(System.in);

System.out.println("Enter Name");
name=obj.nextLine();

System.out.println("Enter age ");
   age = obj.nextInt();


System.out.println("Enter salary ");
 sal = obj.nextFloat();
System.out.println("DepartNumber");
deptno=obj.nextInt();
}
public void  showData()
{
System.out.println("Name = "+name);
System.out.println("age = "+age);
System.out.println("Salary = "+sal);
System.out.println("DeptNo = "+deptno);


}


public static void main(String args[]){
  ExamClass obj=new ExamClass();
  obj.getInput();
  obj.showData();
obj.getInput();
obj.showData();
}
}