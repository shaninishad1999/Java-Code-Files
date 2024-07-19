public class Task_5 {
    public static void main(String[] args) {
        String original = "Java";
        char[] charArray = original.toCharArray();

       
        char temp = charArray[0];
        charArray[0] = charArray[1];
        charArray[1] = temp;

      
        temp = charArray[2];
        charArray[2] = charArray[3];
        charArray[3] = temp;


        String swapped = new String(charArray);

        // Print the result
        System.out.println("Original string: " + original);
        System.out.println("Swapped string: " + swapped);
    }
}
