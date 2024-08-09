class OverLoadMedhod{

public void add(){
int a,b,c;
a=10;
b=20;
c=a+b;
System.out.println("Addition without argument "+c);
}
public void add(int a,int b){
int c;
a=10;
b=20;
c=a+b;
System.out.println("Addition with int argument "+c);
}
public void add(float a,float b){
float c;
c=a+b;
System.out.println("Addition with float argument "+c);
}
public void add(double a,double b){
double c;
c=a+b;
System.out.println("Addition with double argument "+c);
}

public void add(String a,String b){
int c;
c=Integer.parseInt(a)+Integer.parseInt(b);
System.out.println("Addition with String argument "+c);
}

public static void main(String args[]){
 OverLoadMedhod obj=new OverLoadMedhod();
obj.add();
obj.add(5,7);
obj.add(12.5,16.8);
obj.add(12.5f,16.8f);
obj.add("1","2");
}
}
