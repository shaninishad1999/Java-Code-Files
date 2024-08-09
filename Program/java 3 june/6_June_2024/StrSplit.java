class  StrSplit{

	public static void main(String args[]){
	String str="Welcome to bhopal this is city of lake";
	String arr[]=str.split(" ");
	int len=arr.length;
	System.out.println("Number of words = "+(len-1));
	System.out.println(str);


}
}