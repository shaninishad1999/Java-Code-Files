import java.util.Scanner;

class Task_1 {
    public static void main(String args[]) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Input custom string: ");
        String str = obj.nextLine();
        StringBuffer st = new StringBuffer(str);

        System.out.print("String to be added: ");
        String s = obj.nextLine();

        System.out.println("Where do you want to add the string?");
        System.out.println("Type E for end, B for beginning, M for 3rd index");
        char ch = obj.next().charAt(0);

        switch (ch) {
            case 'B':
                st.insert(0, s);
                System.out.println("String added at the beginning: " + st);
                break;
            case 'E':
                st.append(s);
                System.out.println("String added at the end: " + st);
                break;
            case 'M':
                st.insert(3, s);
                System.out.println("String added at the 3rd index: " + st);
                break;
            default:
                System.out.println("Invalid option.");
        }

        obj.close();
    }
}
