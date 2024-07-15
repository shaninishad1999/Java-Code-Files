import java.util.Scanner;

class Task_2 {

	public static void main(String args[]) {

		int n, i, sum = 0, digit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Number : ");
		n = sc.nextInt();

		int temp = n;
		System.out.print("Factor of " + n + " are : ");
		for (i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + "\t");
			}
		}

		while (temp != 0) {
			digit = temp % 10;
			sum = sum + digit;
			temp = temp / 10;
		}
		System.out.println("\nSum of digit : " + sum);
		int s = 0, d;
		while (sum != 0) {
			d = sum % 10;
			s += d;
			sum /= 10;
		}
		System.out.println("Sum of digit ka sum :" + s);
		if (s == 1) {
			System.out.println("Magic Number");
		} 

	}
}
