import java.util.Scanner;

public class LongestWordFinder{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sentence from user
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Split the sentence into words using space 
        String[] words = sentence.split("\\s+");

        // Initialize a variable to store the longest word
        String longestWord = "";

        for (String word : words) {
            
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // Output the longest word
        System.out.println("The longest word is: " + longestWord);

        scanner.close();
    }
}