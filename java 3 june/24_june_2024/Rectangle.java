import java.util.Scanner;
class Rectangle{
int l;
int b;
//instance variable
public void getData(){
Scanner obj=new Scanner(System.in);
System.out.println("Enter Length : ");
l=obj.nextInt();
System.out.println("Enter Breadth : ");
b=obj.nextInt();
}
public void showData(){

System.out.println("Length : "+l);
System.out.println("Breadth : "+b);

}
public void getArea(){
System.out.println("Area : "+(l*b));
}
public void getPara(){
System.out.println("Para : "+2*(l+b));
}

public static void main(String args[])
{
Rectangle r=new Rectangle();
r.getData();
r.showData();
r.getArea();
r.getPara();
}
}



