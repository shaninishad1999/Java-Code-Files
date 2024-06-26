class  StrT{  //it is remove white space

	public static void main(String args[]){

	String str="  Hello World  ";
	System.out.println("Before = "+str.length());
	System.out.println(str);
	String s=str.trim();
	System.out.println("After = "+s.length());
	System.out.println(s);

}
}