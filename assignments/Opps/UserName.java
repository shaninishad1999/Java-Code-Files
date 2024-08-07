class UserName {
    String first_name;
    String last_name;
    
 
    public String fullName() {
        return first_name + " " + last_name;
    }

    public static void main(String[] args) {
        UserName obj = new UserName();
        obj.first_name = "Shani";
        obj.last_name = "Deval";
        
        String full_name = obj.fullName();
     System.out.println("Sample first name = " + obj.first_name + ", last name = " + obj.last_name + ", then full name is " + full_name);
    }
}
