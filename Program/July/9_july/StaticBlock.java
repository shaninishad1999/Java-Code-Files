class StaticBlock {
    static String name = "Shanideval";

    static {
        String n = "Hari";
        int age = 25;
        System.out.println("Static Block called. Name = " + name);
        System.out.println("Static Block called. Name 2 = " + n);
        System.out.println("Static Block called. Age = " + age);
    }

    public static void main(String[] args) {
        System.out.println("Main Method called. Name = " + name);
    }
}
