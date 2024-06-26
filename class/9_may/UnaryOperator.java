class UnaryOperator{
	
	public static void main (String args[]){

	 int a=45,b=50;

	a++;   //a=46
	System.out.println("Post Increment : "+a);
	//System.out.println("Post Increment : "+b);
	

	++b;   //b=51
	//System.out.println("Pre Increment : "+a);
	System.out.println("Pre Increment : "+b);

	
	
	b=a--;   //b=45,a=46
	System.out.println("Post Decrement : "+a);
	System.out.println("Post Dcrement : "+b);
	
	
	b=--a;   //b=44,a=44
	System.out.println("Pre Decrement : "+a);
	System.out.println("Pre Decrement : "+b);

	int c=a++ + --b + --a;
	//c=44+43+44=131
	System.out.println("Addition : "+c);
}
}