public class MyUtility {
    
   
    private MyUtility() {
       
    }

  
    public static int countVowel(String userName) {
        int count = 0;
        for (int i = 0; i < userName.length(); i++) {
            if (isVowel(userName.charAt(i))) {
                count++;
            }
        }
        return count;
    }


    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        String userName = "Shanideval";
        int vowelCount = MyUtility.countVowel(userName);
        System.out.println("Number of vowels in '" + userName + "' is: " + vowelCount);
    }
}
