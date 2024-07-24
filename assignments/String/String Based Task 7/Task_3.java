import java.util.Scanner;

class Task_3 {
    String arr[] = new String[5];
    int top = -1;

    // Push element
    public void push(String data) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            arr[top] = data;
        }
    }

    // Pop element
    public String pop() {
        String r = null;
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            r = arr[top];
            top--;
        }
        return r;
    }

    // Display stack elements
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }


    public static void main(String args[]) {
        Task_3 t = new Task_3();

        t.push("Hello");
        t.push("World");
        
        t.display(); // Display original stack
        
 
    }
}
