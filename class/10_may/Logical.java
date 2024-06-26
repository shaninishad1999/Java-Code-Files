class Logical{

	public static void main(String args[]){

	int a,b,c,d;
	a=10;
	b=20;
	c=30;
	d=40;
	//Logical AND
	//System.out.println(a>b && b>c);
	//boolean r=a<b && c<d;
	//System.out.println(r);

	//Logical OR
	// System.out.println(a<b || b>c);
	// boolean r=a<b || c<d;
	// System.out.println(r);

	//Logical NOT
	System.out.println(!(a<b || b>c));
	boolean r=!(a>b || c>d);
	System.out.println(r);


}
}