class s4{

	public static void main(String args[]){

	// indexof();
	String str="Welcome";
	int x=str.lastIndexOf("c");
	int y=str.lastIndexOf("e",2);
	int z=str.lastIndexOf("m");
	System.out.println(x); //3
	System.out.println(y); // 1
	System.out.println(z);//5
	int zz=str.lastIndexOf("Zee",2);
	System.out.println(zz); //-1
	int zzz=str.lastIndexOf("Mee",2);
	System.out.println(zzz); //-1	

}
}