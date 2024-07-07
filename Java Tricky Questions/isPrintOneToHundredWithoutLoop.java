//print number 1 to 100 without any loop

public class isPrintOneToHundredWithoutLoop {
    public static void isprintOneToHundredWithoutLoop(int n) {
        if (n <= 100) {
            System.out.println(n);
            n++;
            isprintOneToHundredWithoutLoop(n);
        }
    }
    public static void main(String[] args) {
        isprintOneToHundredWithoutLoop(1);
    }
}
