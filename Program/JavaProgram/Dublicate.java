import java.util.Scanner;

class Duplicate {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[] = new int[5];
        
        // Input phase
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj.nextInt();
        }
        
        // Finding and printing duplicates
        System.out.println("Duplicates:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
