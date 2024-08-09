class MultiFun{

public static void isSum(int a,int b){
    System.out.println("Function 1");
    System.out.println("Sum = "+(a+b));

}
public static void isMulti(int a,int b){
 System.out.println("functon 2");
System.out.println("mulit= "+(a*b));
}
public static void isDiv(int a,int b){
 System.out.println("functon 3");
System.out.println("mulit= "+(a*b));
}
	

public static void main(String args[]){
MultiFun obj=new MultiFun();
obj.isSum(5,5);
obj.isMulti(5,5);
obj.isDiv(5,4);
}
}