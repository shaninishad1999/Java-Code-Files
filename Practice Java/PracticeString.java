class PracticeString{

	public static void main(String args[]){
	StringBuffer str=new StringBuffer("welcome");
	System.out.println("Before replace : "+str);
	for(int i=0;i<str.length();i++)
	{
	char c=str.charAt(i);
	if(c=='a' || c=='i' || c=='o' || c=='u' || c=='e')
	{
	str.delete(i,i+1);
	}
	}
	System.out.println("After replace: "+str);
	

}
}