import java.util.Scanner;
class Task_3{

	String arr[]=new String[5];
	int  top=-1;

// push element
public void push(String data){
if(top==arr.length-1)
{
System.out.println("Stack Over Flow");
}
else{
top++;
arr[top]=data;
}
} 


//pop element

public String  pop(){
String r=null;
if(top==-1)
{
System.out.println("STack under flow");
}
else
{
r=arr[top];
top--;

}
return r;
}

//display stack element
public void display(){
if(top==-1)
{
System.out.println("stack is empty");
}
for(int i=top;i>=0;i--)
{
System.out.println("\t"+arr[i]);
}

}


public static void main(String args[]){
Task_3  t=new Task_3();
 
t.push("Hello World");
 
t.display();

}
}