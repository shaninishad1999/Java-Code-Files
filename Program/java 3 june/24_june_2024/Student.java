import java.util.Scanner;
//assignment

class Student{
String name;
String enroll;
float per;
int rollno;
char section;
int p;
int c;
int m;
int e;
int h;
//instance variable

public void getData(){
Scanner obj=new Scanner(System.in);
System.out.print("Enter Name : ");
name=obj.nextLine();
System.out.print("Enter Enroll : ");
enroll=obj.nextLine();
System.out.print("Enter section : ");
section=obj.next().charAt(0);
System.out.print("Enter P : ");
p=obj.nextInt();
System.out.print("Enter C : ");
c=obj.nextInt();
System.out.print("Enter M : ");
m=obj.nextInt();
System.out.print("Enter E : ");
e=obj.nextInt();
System.out.print("Enter H : ");
h=obj.nextInt();

}
public void showData(){
//student information
System.out.println("Enter Name : "+name);
System.out.println("Enter Enroll : "+enroll);
System.out.println("Enter Section: "+section);
System.out.println("Enter P : "+p);
System.out.println("Enter C : "+c);
System.out.println("Enter M : "+m);
System.out.println("Enter E : "+e);
System.out.println("Enter H : "+h);
System.out.println("Enter Per : "+per);

}
public void getTotalmarks(){
System.out.println("Total Mark : "+(p+c+m+e+h));

}
public void getPercentage(){
System.out.println("Per : "+(p+c+m+e+h)/5+"%");
}

public static void main(String args[])
{
Student obj=new Student();
obj.getData();
obj.showData();
obj.getTotalmarks();
obj.getPercentage();

}
}



