class A{

int x=10; 
//this is default constrotor
public A(){
System.out.println("This is class A defualt constroutor");
}

//this is parameterize constrotor
public A(int x){
this.x=x;
System.out.println("This is class A parameterized constroutor");
}
}

class B extends A{

int y=20;

// default constrotor
public B(){
System.out.println("This is class B defualt constroutor");
}

//parameterized constrotor
public B(int x,int y){
super(x);
this.y=y;
System.out.println("This is class B parameterized constroutor");
}
}

class Main extends B{

 int z=30;
public Main(){
	System.out.println("This is class Main defualt constroutor");
}

public Main(int x,int y,int z){
super(x,y);
this.z=z;
System.out.println("this parameterized constrotor main");
}
 public void show() {
        System.out.println("This is A Parent X: " + super.x);
        System.out.println("This is B Child y: " + super.y);
        System.out.println("This is Main z: " + z); // Corrected println method
    }
public static void main(String args[]){
Main obj=new Main(1,2,3);
obj.show();
}
}










