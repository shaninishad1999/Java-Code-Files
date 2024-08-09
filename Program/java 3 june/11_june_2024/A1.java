class A1{
	public static void main(String args[]){

	StringBuilder obj=new StringBuilder("Welcome");
	System.out.println(obj);
	obj.insert(7, " To Bhopal");
	System.out.println(obj);
	obj.delete(11,17);
	System.out.println(obj);

}
}