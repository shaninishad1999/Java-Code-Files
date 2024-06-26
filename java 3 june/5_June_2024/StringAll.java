class StringAll{

	public static void main(String args[]){

	// 1 Compare string 
	String a=new String("Hello");
	String b=new String("Hello");
	System.out.println(a==b);  //false 
	System.out.println(a.equals(b));  // true
	
	String c="Hello";
	String d="Hello";
	System.out.println(c==d);  //true
	System.out.println(c.equals(d));  // true

	// 2 charAt() used for indivisual charater find
	String e="Hello";
	char f=e.charAt(1);
	System.out.println(f);  //e


	//3. concat() it is used to concat two string and make a new string
	String m="Hello Ram";
	String n=", How are u?";
	String o=m.concat(n);
	System.out.println(o);  //Hello Ram, How are u?


	// 4. contains()  it is check that character or letter are in or not if in return true or false
	 m="Hello Ram";
	boolean s=m.contains("lo");
	System.out.println(s);  //true
	 s=m.contains("lso");
	System.out.println(s);  //false
	
	//5. endsWith() It is used to check a String ends with a suffix
	// it is return true or false value

	String x="www.studentinsidelibrary.com";
	boolean y=x.endsWith(".com");
	System.out.println(y); //true 
	boolean z=x.endsWith("ry");
	System.out.println(z); //false	

	//6. startsWith() It is used to check a String starts with a suffix
	// it is return true or false value

	boolean kk=x.startsWith("www");
	System.out.println(kk); //true 

	boolean zz=x.startsWith("ry");
	System.out.println(zz); //false	
	System.out.println(" String 7"); 	

	//7. isEmpty();
	String q=" ";
	String q1="Ram";
	System.out.println(q.isEmpty());  //false
	System.out.println(q1.isEmpty());  //false
	
	// 7. equalsIgnoreCase()
	 a=new String("Hello");
	String v=new String("HellO");
	System.out.println(a.equalsIgnoreCase(v));  //true

	//9. indexOf()  it return integer value
	 a=new String("Hello");
	int j=a.indexOf("e");
	System.out.println(j);
	System.out.println(a.length());


	

	





}
}