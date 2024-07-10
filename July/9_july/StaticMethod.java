class StaticMethod {
    static String name = "Shanideval";

    static {
        String n = "Hari";
        int age = 25;
        System.out.println("Static Block called. Name 1= " + name);
        System.out.println("Static Block called. Name 1 = " + n);
        System.out.println("Static Block called. Age = " + age);
    }
public static void Detail(String n,int age){

   System.out.println("Static Block called. Name  1 = " + name);
        System.out.println("Static Block called. Name 2= " + n);
        System.out.println("Static Block called. Age = " + age);
}
public static void Details(String n,int age){

   System.out.println("Static Block 2 called. Name 3 = " + name);
        System.out.println("Static Block 2 called. Name 3 = " + n);
        System.out.println("Static Block 2  called. Age = " + age);
}
    public static void main(String[] args) {
        System.out.println("Main Method called. Name = " + name);
	Detail("Harikesh",20);
	Details("Harikesh",21);
    }
}
