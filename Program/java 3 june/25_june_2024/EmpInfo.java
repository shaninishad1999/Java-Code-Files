import java.util.Scanner;
class EmpInfo{

String name;
    String job;
    double bsal;
    int deptno;
    int hra, da, ta, gs, tn;

public void getData() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Name = ");
        name = obj.nextLine();
        System.out.print("Enter job = ");
        job = obj.nextLine();
        System.out.print("Enter bsal = ");
        bsal = obj.nextFloat();
        System.out.print("Enter deptno = ");
        deptno = obj.nextInt();
    }

    public void showData() {
        System.out.println("Your Name = " + name);
        System.out.println("Your Job = " + job);
        System.out.println("Your Bsal = " + bsal);
        System.out.println("Your DeptNo = " + deptno);
    }
    public double getHRA() {
        hra = (int) (bsal * (20.0 / 100));
        return hra;
    }

    public double getDA() {
        da = (int) (bsal * (10.0 / 100));
        return da;
    }

    public double getTA() {
        ta = (int) (bsal * (10.0 / 100));
        return ta;
    }

    public double totalIncentive() {
        tn = hra + da + ta;
        return tn;
    }

    public double grossSalary() {
        gs = (int) (bsal + tn);
        return gs;
    }

public static void main(String args[]){

 EmpInfo obj = new EmpInfo();
System.out.println();
        obj.getData();
        obj.showData();
        System.out.println("Total HRA : " + obj.getHRA());
        System.out.println("Total DA : " + obj.getDA());
        System.out.println("Total TA : " + obj.getTA());
        System.out.println("Total Incentive : " + obj.totalIncentive());
        System.out.println("Total Gross Salary : " + obj.grossSalary());
}
}