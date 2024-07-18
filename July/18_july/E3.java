class E3{

public static void main(String args[]){

int a=-1;
try{
 a=Integer.parseInt(args[0]);
if(a<0 || a>100){
AgeException ae=new AgeException("Invalid age");
	
throw ae;

}
System.out.println("Valid age");
}catch(AgeException x){
System.out.println(x.getMsg());
}
}
}