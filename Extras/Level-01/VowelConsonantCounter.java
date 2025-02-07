import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        text = text.toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
            // Check if character is a consonant
            else if (ch >= 'a' && ch <= 'z') {
                consonantCount++;
            }
        }

        // Output the results
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);

        input.close();
    }
}