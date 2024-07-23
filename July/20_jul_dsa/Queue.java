class Queue{

int q[]=new int[5];
int front=-1;
int rear=-1;
public void enq(int data){

if(rear==q.length-1)
{
System.out.println("Que is overflow");
}
else
{
rear++;
q[rear]=data;
if (front == -1) {
                front = 0;
            }
}
}


public void display(){

if(front==-1){
 System.out.println("Queue is emty");
}
else{

for(int i=front;i<=rear;i++)
{
 System.out.println("\t"+q[i]);
}
}
}


public int deq(){

 int r=-1;
 if(front==-1 || front>rear)
{

System.out.println("que is empty");
}
else
{
r=q[front];
front++;
 if (front > rear) {
                front = rear = -1;
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


public static void main(String args[]){
Queue  t=new Queue();

t.enq(10);
t.enq(20);
t.enq(30);
t.enq(40);
t.enq(50);
t.display();
System.out.println(t.peek());
System.out.println("deleted + "+t.deq());
System.out.println("deleted + "+t.deq());
System.out.println("deleted + "+t.deq());
System.out.println("deleted + "+t.deq());
System.out.println("deleted + "+t.deq());



}



}