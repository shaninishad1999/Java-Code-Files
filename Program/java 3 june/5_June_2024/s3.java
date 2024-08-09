class s3{

	public static void main(String args[]){

	// indexof();
	String str="Welcome";
	int x=str.indexOf("c");
	int y=str.indexOf("e",2);
	int z=str.indexOf("me",2);
	System.out.println(x); //3
	System.out.println(y); // 6
	System.out.println(z);//5
	int zz=str.indexOf("Zee",2);
	System.out.println(zz); //-1
	int zzz=str.indexOf("Mee",2);
	System.out.println(zzz); //-1	

}
}