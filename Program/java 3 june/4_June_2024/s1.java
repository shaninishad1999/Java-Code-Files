class s1{
	public static void main(String args[]){
// heap me object tabhi banega jub new keyword use hoga, otherwise scp me banega
	String a=new String("hello");
	String b=new String("hello");
	System.out.println(a==b);     //false     // it is compare to data not a string value INT CHAR
	System.out.println(a.equals(b));  //true   // it is compare (reference) OF CONTENT
	
	
	String c="hello";
	String d="hello";
	System.out.println(c==d);   //true

	String e=b;  // it make in scp
	System.out.println(e==b);  //true

	String x="hello";
	String y="HELLO";
	System.out.println(x.equals(y));
	System.out.println(x.equalsIgnoreCase(y));

	Integer m=10;
	Integer n=10;
	System.out.println(m==n);
	System.out.println(m.equals(n));
	
	


	

}
}
