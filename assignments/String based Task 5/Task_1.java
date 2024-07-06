import java.util.Scanner;

class Task_1 {

    public static void isLargestSmallest(String s){
        String[] words = s.split(" "); 

        if (words.length == 0) {
            System.out.println("No words found in the input.");
            return;
        }

        String smallestWord = words[0];
        String largestWord = words[0];

        for (int i = 1; i < words.length; i++) {
            String currentWord = words[i];
            
            if (currentWord.length() < smallestWord.length()) {
                smallestWord = currentWord;
            }
            
            if (currentWord.length() > largestWord.length()) {
                largestWord = currentWord;
            }
        }

        System.out.println("Smallest word: " + smallestWord);
        System.out.println("Largest word: " + largestWord);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = obj.nextLine();
        isLargestSmallest(str);
   
    }

}
