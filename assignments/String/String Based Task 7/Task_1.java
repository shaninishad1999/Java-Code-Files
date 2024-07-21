import java.util.Scanner;

class Task_1 {

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Input String : ");
        String str = obj.nextLine();
        System.out.print("Enter Index : ");
        int n = obj.nextInt();
        System.out.print("Enter ch : ");
        char ch = obj.next().charAt(0);

        StringBuffer sk = new StringBuffer();

        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (i == n) {
                sk.append(ch);
            } else {
                sk.append(charArray[i]);
            }
        }

        System.out.println("Modified String: " + sk.toString());
    }
}
