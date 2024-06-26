import java.util.Scanner;
class All_Input{

	public static void main(String args[]){
	
	String emp_name,job_profile;
	float salary;
	int imp_no,d_no;
	char s;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter Employee Name : ");
	emp_name=obj.nextLine();
	System.out.println("Enter Salary : ");
	salary=obj.nextFloat();
	obj.nextLine();
	System.out.println("Enter Job Profile : ");
	job_profile=obj.nextLine();

	System.out.println("Enter EmpNo : ");
	imp_no=obj.nextInt();

	System.out.println("Enter DeptNo : ");
	d_no=obj.nextInt();

	System.out.println("Enter Grade : ");
	s=obj.next().charAt(0);

	System.out.println("Enter Employee Name : "+emp_name);
	System.out.println("Salary : "+salary);
	System.out.println("Enter Job Profile : "+job_profile);
	System.out.println("Enter EmpNo : "+imp_no);
	System.out.println("Enter DeptNo : "+d_no);
	System.out.println("Enter Grade : "+s);



}
}
	
