import java.util.Scanner;

class Task_4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = obj.nextLine();
        
    
        char[] arr = str.toCharArray();

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        String sortedStr = new String(arr);
        System.out.println("Sorted String: " + sortedStr);

    }
}
