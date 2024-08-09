import java.util.Scanner;

class Array_1 {
    public static void main(String args[]) {

        Scanner obj = new Scanner(System.in);
        int arr[] = new int[5];
        
     
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj.nextInt();
        }
        
       
        System.out.println("Stored array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }
        System.out.println("\n==========================================");


        System.out.println("Enter array position to modify:");
        int pos = obj.nextInt();
        
        if (pos < 0 || pos >= arr.length) {
            System.out.println("Invalid position. Please enter a valid position.");
        } else {
        
            System.out.println("Enter new value:");
            int newVal = obj.nextInt();
            arr[pos] = newVal;

          
            System.out.println("Modified array:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print("\t" + arr[i]);
            }
        }

        
    }
}
