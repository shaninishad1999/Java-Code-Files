class WordFound{
	public static void main(String args[]){

	String sentences[] = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
	
	int count=0;
	int count1=0;
	int count2=0;
	String str[]=sentences[0].split(" ");
	count=str.length;
	String str1[]=sentences[1].split(" ");
	count1=str1.length;
	String str2[]=sentences[2].split(" ");
	count2=str2.length;

	System.out.println(count);
	System.out.println(count1);
	System.out.println(count2);

}
}