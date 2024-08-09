class S3{
	public static void main(String args[]){
	
	StringBuffer str=new StringBuffer("Welcome");
	System.out.println("Before delete : "+str);
	//str.replace(3,7,"done");
	for(int i=0;i<str.length();i++){
	char c=str.charAt(i);
	if(c=='a'|| c=='i'|| c=='e'||c=='o'|| c=='u'){
	str.delete(i,i+1);
	}
	}
	System.out.println("After deleter : "+str);

}
}