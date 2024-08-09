import java.util.Scanner;

class BankNotes {
    public static void main(String args[]) {
        int amount, hundred, fifty, twenty, ten, five, two, one;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Amount: ");
        amount = obj.nextInt();  // 1388

        hundred = amount / 100;  // hundred=13
        amount %= 100;   // amount=88

        fifty = amount / 50;  // fifty=1,
        amount %= 50; // amount=38

        twenty = amount / 20;  // twenty=1,
        amount %= 20; // amount=18

        ten = amount / 10;   // ten=1
        amount %= 10; // amount=8

        five = amount / 5;     // five =1
        amount %= 5; // amount=3

        two = amount / 2;  // two=1
        amount %= 2; // amount=1

        one = amount;  // one=1

        System.out.println("Notes of 100: " + hundred);
        System.out.println("Notes of 50: " + fifty);
        System.out.println("Notes of 20: " + twenty);
        System.out.println("Notes of 10: " + ten);
        System.out.println("Notes of 5: " + five);
        System.out.println("Notes of 2: " + two);
        System.out.println("Notes of 1: " + one);

        System.out.println("Total Amount Recalculated after Notes: " + (hundred * 100 + fifty * 50 + twenty * 20 + ten * 10 + five * 5 + two * 2 + one * 1));
    }
}
