import java.util.Scanner;
class Age{

public static void main(String args[]){


try{
Scanner obj=new Scanner(System.in);
System.out.print("Enter age : ");
int age=obj.nextInt();
if(age<0 || age>100)
{
  AgeExcepton ae=new AgeExcepton("Invalid age");
 throw ae;
}
else
{
System.out.println("Valid Age");
}
}catch(AgeExcepton x){

System.out.println(x.getMsg());
}
}
}