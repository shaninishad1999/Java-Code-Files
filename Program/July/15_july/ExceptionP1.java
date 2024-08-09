class ExceptionP1 {

    public static void main(String args[]) {

     int num=0;
        try {
           num=Integer.parseInt(args[0]);
         
        } catch (ArithmeticException e) {
            System.out.println("This is AM exception block");
        }catch(ArrayIndexOutOfBoundsException ae){
System.out.println("This is  array exception block");
}
for(int i=0;i<num;i++){

        System.out.println("Result = " +(int)Math.pow(i, 2));
}
    }
}
