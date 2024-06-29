public class Task_4 {

    public static void isOccurrence(String inputString) {
        int[] charCount = new int[26];
        
       
        inputString = inputString.toLowerCase();
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch >= 'a' && ch <= 'z') { 
                charCount[ch - 'a']++; 
            }
        }
        
        int maxCount = 0;
        char mostFrequentChar = ' ';
        
 
        for (int i = 0; i < 26; i++) {
            if (charCount[i] > maxCount) {
                maxCount = charCount[i];
                mostFrequentChar = (char) ('a' + i);
            }
        }
        
        System.out.println("Most frequent character: " + mostFrequentChar);
    }

    public static void main(String[] args) {
        String input = "Welooo";
        isOccurrence(input);
    }
}
