class StackImp{

	int arr[]=new int[5];
	int top=-1;

public void push(int data){
	  if(top==arr.length-1){
	System.out.println("Over flow Condition");
	}
	else{
	top++;
	arr[top]=data;
	}
}

public int  pop(){
	int r=-1;
	if(top==-1){
	System.out.println("Under-Flow Condition");
	}
	else{
	r=arr[top];
	top--;
	}
	return r;
}
public int peek(){
	int r=-1;
	if(top==-1)
	{
	System.out.println("Stack is Empty");
	}
	else
	{
	r=arr[top];
	}
	return r;
}

public boolean isEmpty(){
return top==-1?true:false;
}
public boolean isFull(){
return top==arr.length-1?true:false;
}


	
public void display(){
	if(top==-1){
	System.out.println("stack is empty");
	}
	else{
	for(int i=arr.length-1;i>=0;i--)
	{
	System.out.println("======> "+arr[i]);
	}
	}
}

public static void main(String args[]){

	StackImp st=new StackImp();
	
	st.push(10);
	st.push(20);
	st.push(30);
	st.push(40);
	st.push(50);
	st.push(60);
	st.display();
System.out.println("Stack is Full : "+st.isFull());
System.out.println("Top element : "+st.peek());
	System.out.println("Deleted element = "+st.pop());
	System.out.println("Deleted element = "+st.pop());
	System.out.println("Deleted element = "+st.pop());
	System.out.println("Deleted element = "+st.pop());
	System.out.println("Deleted element = "+st.pop());
	System.out.println("Deleted element = "+st.pop());
System.out.println("Stack is Empty : "+st.isEmpty());

	
	


}
}