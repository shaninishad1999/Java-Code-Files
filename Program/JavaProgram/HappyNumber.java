import java.util.Scanner;

public class HappyNumber {

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter any number");
    int n = obj.nextInt();
    int num = n;
    int k = n;
    int sum = 0, digit;
    // 19 adding sum
    while (k != 0) {
      digit = k % 10;
      sum = sum + digit;
      k /= 10;

    }

    int add = sum;

    int s = 0;
    // 19 square sum
    while (num != 0) {
      int d = num % 10;
      s = s + d * d;
      num /= 10;
    }
    int sums = s;

    int x = 0;

    // square find then his sum
    while (sums != 0) {
      int digi = sums % 10;
      x = x + digi;
      sums /= 10;
    }

    if (add == x) {
      System.out.println("Happy Number");

    } else {
      System.out.println("Sad Number");
    }

  }

}
