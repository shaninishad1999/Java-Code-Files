import java.util.Scanner;
class Circle{

int r;
//instance variable

public void getData(){
Scanner obj=new Scanner(System.in);
System.out.println("Enter Radius : ");
r=obj.nextInt();

}
public void showData(){

System.out.println("Radius : "+r);


}
public void getCircle(){
System.out.println("Area of circle: "+3.14*r*r);
}
public void getCirc(){
System.out.println("Circume : "+2*3.14*r);
}

public static void main(String args[])
{
Circle k=new Circle();
k.getData();
k.showData();
k.getCircle();
k.getCirc();
}
}



