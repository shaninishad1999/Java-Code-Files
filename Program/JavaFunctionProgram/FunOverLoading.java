class FunOverLoading{
	
public static void isSum(int a,int b){
    System.out.println("Function 1");
    System.out.println("Sum int = "+(a+b));

}
public static void isSum(double x,double y){
 System.out.println("functon 2");
System.out.println("mulit double= "+(x*y));
}
public static void isSum(float m,float n){
 System.out.println("functon 3");
System.out.println("mulit float = "+(m*n));
}


public static void main(String args[]){
FunOverLoading obj=new FunOverLoading();
obj.isSum(4,5);
obj.isSum(3.5,4.5);
obj.isSum(4.4f,8.85f);
}
}
