import java.util.Scanner;

class Task_1 {

    public static void isLargestSmallest(String s){
        String[] words = s.split(" "); 

        String minWord = words[0];
        String mxWord = words[0];

        for (int i = 1; i < words.length; i++) {
            String currentWord = words[i];
            
            if (currentWord.length() < minWord.length()) {
                minWord = currentWord;
            }
            
            if (currentWord.length() > mxWord.length()) {
                mxWord = currentWord;
            }
        }

        System.out.println("Smallest word: " + minWord);
        System.out.println("Largest word: " + mxWord);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Input the string : ");
        String str = obj.nextLine();
        isLargestSmallest(str);
   
    }

}
