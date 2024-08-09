class CompareTo{  // it is return  integer value
	public static void main(String args[]){
	
	String s1="a";  //97
	String s2="A";  // 65
	String s3="a"; //
	int x=s1.compareTo(s2);  //return positive value
	int y=s2.compareTo(s1);  // return neagtive value
	int z=s1.compareTo(s1);  // return zero value
	System.out.println(x);   
	System.out.println(y);
	System.out.println(z);

	String a1="RAM";
	String a2="SHA";
	int k=a1.compareTo(a2);
	System.out.println(k);
	

}
}