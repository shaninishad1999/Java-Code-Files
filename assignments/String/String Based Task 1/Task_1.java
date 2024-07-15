import java.util.Scanner;

class Task_1 {
	public static void main(String args[]) {

		
		Scanner obj = new Scanner(System.in);
		String str;
		System.out.println("Enter String\n");
		str = obj.nextLine();
		
		System.out.println("\n Print all the occurrences index of b and t in the string.\n");
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'b' || ch == 't') {
				System.out.println("Index of " + ch + " = " + i);
			}
		}
		
		String arr[] = str.split(" ");
		System.out.println("\nPrint each word along with its length in a new line.\n");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " - Length = " + arr[i].length());

		
		}
		System.out.println("\nPrint all the words that start with b in the string.\n");

		for (int i = 0; i < arr.length; i++) {

			if (arr[i].toLowerCase().startsWith("b")) {

				System.out.println(arr[i]);
			}

		}

	}
}
