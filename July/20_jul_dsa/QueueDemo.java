class QueueDemo{

int q[]=new int[5];
int front=-1;
int rear=-1;
public void enq(int data){
if(rear==q.length-1)
{
System.out.println("Over flow condition");
}
else
{

if(front==-1&&rear==-1){
front++;
rear++;
q[rear]=data;
}
else
{
rear++;
q[rear]=data;

}
}

}
public void display(){
if(front==-1 && rear==-1){

System.out.println("Queue is empty");
}
else
{
System.out.println("Queue Elements are : ");
for(int i=front;i<=rear;i++)
{
System.out.println("\t"+q[i]);
}
}
}


public int deq(){
int r=-1;
if(front==-1 && rear==-1){
System.out.println("Under flow condition");
}
else
{
if(front==rear){
r=q[front];
front=rear=-1;
}
else{
r=q[front];
front++;
}
}
return r;
}

public int peek(){
if(front==-1 && rear==-1)
{
return -1;
}
return q[front];
}
public void isEmpty(){
if(front==-1 && rear==-1)
{
 System.out.println("queue is empty ");
}
}

public void isFull(){
if(rear==q.length-1 )
{
 System.out.println("queue is full ");
}
}



public static void main(String args[]){

QueueDemo q=new QueueDemo();

System.out.println("Peek element : "+q.peek());
q.enq(10);
q.enq(20);
q.enq(30);
q.enq(40);
q.enq(50);
q.enq(60);
q.enq(70);
System.out.println("Peek element : "+q.peek());
q.display();
q.deq();
q.deq();
q.isFull();
System.out.println("Peek element : "+q.peek());
q.deq();
q.deq();
q.deq();

q.isEmpty();

}
}