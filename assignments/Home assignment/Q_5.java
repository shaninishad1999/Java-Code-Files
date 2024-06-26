// Q5. Write a Java program that requires the user to enter a single
// character from the alphabet. Print Vowel or Consonant, depending on user
// input. If the user input is not a letter (between a and z or A and Z), or is a
// string of length &gt; 1, print an error message.

import java.util.Scanner;
class Q_5{

	public static void main (String args[]){

	char ch;
	Scanner shani=new Scanner(System.in);
	System.out.printf("Input an alphabet: ");
	ch=shani.next().charAt(0);
	
	if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
	{
	System.out.println("Input letter is Vowels");
	}
	 
	else
	{
	System.out.println("Input letter is Consonant");
	}

}
}
	