public class InputExampl {
    public static void main(String[] args) {
        java.io.Console console = System.console();

        if (console == null) {
            System.out.println("No console available");
            return;
        }

        // Prompt the user
        String name = console.readLine("Enter your name: ");

        // Display the input
        System.out.println("Hello, " + name + "!");
    }
}
